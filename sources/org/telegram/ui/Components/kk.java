package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kk extends ei {
    public final mz f28405n;
    public final tl0 f28406r;
    public final f2.j0 f28407s;
    public final HorizontalScrollView v;
    public final boolean f28408w;

    public kk(mi miVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        super(context, g6Var, miVar);
        this.f28408w = z4;
        this.f26549f = true;
        org.telegram.ui.ActionBar.p2 p2Var = miVar.f29040c0;
        boolean z10 = !z4 ? 1 : 0;
        mz mzVar = new mz(p2Var, z10, z4, false, getContext(), true, null, null, false, g6Var, false, true);
        this.f28405n = mzVar;
        mzVar.f29325t0 = false;
        mzVar.J(z10, z4, false, false);
        mzVar.f29301l2 = true;
        yw ywVar = mzVar.f29338x;
        if (ywVar != null) {
            ywVar.setVisibility(8);
        }
        mzVar.f29303m2 = true;
        ImageView imageView = mzVar.f29342y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        mzVar.J2 = true;
        addView(mzVar, k7.c6.c(-1.0f, -1));
        HorizontalScrollView y10 = mzVar.y(z10 ? 1 : 0);
        this.v = y10;
        tl0 x10 = mzVar.x(z10 ? 1 : 0);
        this.f28406r = x10;
        x10.j(new fg.e2(this, 21));
        this.f28407s = (f2.j0) x10.getLayoutManager();
        y10.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override
    public final void D(ei eiVar) {
        int i10;
        mi miVar = this.f26546b;
        try {
            miVar.U0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        fg.k1 k1Var = miVar.U0;
        if (this.f28408w) {
            i10 = R.string.SelectSticker;
        } else {
            i10 = R.string.SelectEmoji;
        }
        k1Var.setTitle(LocaleController.getString(i10));
        this.f28407s.h1(0, 0);
    }

    @Override
    public final void F() {
        this.f28406r.x0(0);
    }

    @Override
    public int getCurrentItemTop() {
        tl0 tl0Var = this.f28406r;
        if (tl0Var.getChildCount() <= 0) {
            tl0Var.setTopGlowOffset(tl0Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = tl0Var.getChildAt(0);
        fl0 fl0Var = (fl0) tl0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(36.0f);
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || fl0Var == null || fl0Var.b() != 0) {
            top = dp;
        }
        tl0Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f28406r.getPaddingTop();
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.v.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    public void setDelegate(my myVar) {
        this.f28405n.setDelegate(myVar);
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f26546b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kk.y(int, int):void");
    }
}
