package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rk extends oi {
    public final mz f27943n;
    public final xl0 f27944r;
    public final s4.c0 f27945s;
    public final HorizontalScrollView v;
    public final boolean f27946w;

    public rk(wi wiVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, d6Var, wiVar);
        this.f27946w = z10;
        this.f27045f = true;
        org.telegram.ui.ActionBar.m2 m2Var = wiVar.f30020f0;
        boolean z11 = !z10 ? 1 : 0;
        mz mzVar = new mz(m2Var, z11, z10, false, getContext(), true, null, null, false, d6Var, false, true);
        this.f27943n = mzVar;
        mzVar.f26610w0 = false;
        mzVar.I(z11, z10, false, false);
        mzVar.f26582n2 = true;
        cx cxVar = mzVar.f26613x;
        if (cxVar != null) {
            cxVar.setVisibility(8);
        }
        mzVar.f26585o2 = true;
        ImageView imageView = mzVar.f26617y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        mzVar.M2 = true;
        addView(mzVar, w7.y5.c(-1.0f, -1));
        HorizontalScrollView y3 = mzVar.y(z11 ? 1 : 0);
        this.v = y3;
        xl0 x10 = mzVar.x(z11 ? 1 : 0);
        this.f27944r = x10;
        x10.j(new ai.r(this, 20));
        this.f27945s = (s4.c0) x10.getLayoutManager();
        y3.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override
    public final void E(oi oiVar) {
        int i10;
        wi wiVar = this.f27043b;
        try {
            wiVar.X0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        y7 y7Var = wiVar.X0;
        if (this.f27946w) {
            i10 = R.string.SelectSticker;
        } else {
            i10 = R.string.SelectEmoji;
        }
        y7Var.setTitle(LocaleController.getString(i10));
        this.f27945s.h1(0, 0);
    }

    @Override
    public final void G() {
        this.f27944r.x0(0);
    }

    @Override
    public int getCurrentItemTop() {
        xl0 xl0Var = this.f27944r;
        if (xl0Var.getChildCount() <= 0) {
            xl0Var.setTopGlowOffset(xl0Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = xl0Var.getChildAt(0);
        hl0 hl0Var = (hl0) xl0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(36.0f);
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || hl0Var == null || hl0Var.b() != 0) {
            top = dp;
        }
        xl0Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f27944r.getPaddingTop();
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

    public void setDelegate(ny nyVar) {
        this.f27943n.setDelegate(nyVar);
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f27043b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rk.y(int, int):void");
    }
}
