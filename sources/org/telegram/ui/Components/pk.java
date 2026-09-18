package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class pk extends ni {
    public final kz f27059n;
    public final ml0 f27060r;
    public final s4.c0 f27061s;
    public final HorizontalScrollView v;
    public final boolean f27062w;

    public pk(vi viVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context, f6Var, viVar);
        this.f27062w = z10;
        this.f26465f = true;
        org.telegram.ui.ActionBar.o2 o2Var = viVar.f28745f0;
        boolean z11 = !z10 ? 1 : 0;
        kz kzVar = new kz(o2Var, z11, z10, false, getContext(), true, null, null, false, f6Var, false, true);
        this.f27059n = kzVar;
        kzVar.f25778w0 = false;
        kzVar.I(z11, z10, false, false);
        kzVar.f25750n2 = true;
        zw zwVar = kzVar.f25781x;
        if (zwVar != null) {
            zwVar.setVisibility(8);
        }
        kzVar.f25753o2 = true;
        ImageView imageView = kzVar.f25785y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        kzVar.M2 = true;
        addView(kzVar, w7.x5.c(-1.0f, -1));
        HorizontalScrollView y3 = kzVar.y(z11 ? 1 : 0);
        this.v = y3;
        ml0 x10 = kzVar.x(z11 ? 1 : 0);
        this.f27060r = x10;
        x10.j(new ai.r(this, 21));
        this.f27061s = (s4.c0) x10.getLayoutManager();
        y3.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override
    public final void E(ni niVar) {
        int i10;
        vi viVar = this.f26463b;
        try {
            viVar.X0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        w7 w7Var = viVar.X0;
        if (this.f27062w) {
            i10 = R.string.SelectSticker;
        } else {
            i10 = R.string.SelectEmoji;
        }
        w7Var.setTitle(LocaleController.getString(i10));
        this.f27061s.h1(0, 0);
    }

    @Override
    public final void G() {
        this.f27060r.y0(0);
    }

    @Override
    public int getCurrentItemTop() {
        ml0 ml0Var = this.f27060r;
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
        return this.f27060r.getPaddingTop();
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
        this.f27059n.setDelegate(kyVar);
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f26463b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pk.y(int, int):void");
    }
}
