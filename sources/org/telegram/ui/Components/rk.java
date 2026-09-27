package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rk extends oi {
    public final mz f28020n;
    public final yl0 f28021r;
    public final s4.c0 f28022s;
    public final HorizontalScrollView v;
    public final boolean f28023w;

    public rk(wi wiVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var, wiVar);
        this.f28023w = z10;
        this.f27106f = true;
        org.telegram.ui.ActionBar.o2 o2Var = wiVar.f29962f0;
        boolean z11 = !z10 ? 1 : 0;
        mz mzVar = new mz(o2Var, z11, z10, false, getContext(), true, null, null, false, e6Var, false, true);
        this.f28020n = mzVar;
        mzVar.f26636w0 = false;
        mzVar.I(z11, z10, false, false);
        mzVar.f26608n2 = true;
        bx bxVar = mzVar.f26639x;
        if (bxVar != null) {
            bxVar.setVisibility(8);
        }
        mzVar.f26611o2 = true;
        ImageView imageView = mzVar.f26643y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        mzVar.K2 = true;
        addView(mzVar, w7.y5.c(-1.0f, -1));
        HorizontalScrollView y3 = mzVar.y(z11 ? 1 : 0);
        this.v = y3;
        yl0 x10 = mzVar.x(z11 ? 1 : 0);
        this.f28021r = x10;
        x10.j(new ai.r(this, 20));
        this.f28022s = (s4.c0) x10.getLayoutManager();
        y3.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override
    public final void E(oi oiVar) {
        int i10;
        wi wiVar = this.f27104b;
        try {
            wiVar.X0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        y7 y7Var = wiVar.X0;
        if (this.f28023w) {
            i10 = R.string.SelectSticker;
        } else {
            i10 = R.string.SelectEmoji;
        }
        y7Var.setTitle(LocaleController.getString(i10));
        this.f28022s.h1(0, 0);
    }

    @Override
    public final void G() {
        this.f28021r.y0(0);
    }

    @Override
    public int getCurrentItemTop() {
        yl0 yl0Var = this.f28021r;
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
        return this.f28021r.getPaddingTop();
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
        this.f28020n.setDelegate(nyVar);
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f27104b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rk.y(int, int):void");
    }
}
