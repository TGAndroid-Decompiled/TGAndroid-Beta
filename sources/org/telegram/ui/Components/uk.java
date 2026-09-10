package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class uk extends qi {
    public final rz f27686n;
    public final vl0 f27687r;
    public final s4.c0 f27688s;
    public final HorizontalScrollView v;
    public final boolean f27689w;

    public uk(yi yiVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context, f6Var, yiVar);
        this.f27689w = z10;
        this.f26424f = true;
        org.telegram.ui.ActionBar.p2 p2Var = yiVar.f29366f0;
        boolean z11 = !z10 ? 1 : 0;
        rz rzVar = new rz(p2Var, z11, z10, false, getContext(), true, null, null, false, f6Var, false, true);
        this.f27686n = rzVar;
        rzVar.f26867w0 = false;
        rzVar.K(z11, z10, false, false);
        rzVar.f26842o2 = true;
        fx fxVar = rzVar.f26870x;
        if (fxVar != null) {
            fxVar.setVisibility(8);
        }
        rzVar.f26845p2 = true;
        ImageView imageView = rzVar.f26874y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        rzVar.M2 = true;
        addView(rzVar, w7.a6.c(-1.0f, -1));
        HorizontalScrollView y3 = rzVar.y(z11 ? 1 : 0);
        this.v = y3;
        vl0 x10 = rzVar.x(z11 ? 1 : 0);
        this.f27687r = x10;
        x10.j(new bi.a2(this, 18));
        this.f27688s = (s4.c0) x10.getLayoutManager();
        y3.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override
    public final void D(qi qiVar) {
        int i10;
        yi yiVar = this.f26422b;
        try {
            yiVar.X0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        y7 y7Var = yiVar.X0;
        if (this.f27689w) {
            i10 = R.string.SelectSticker;
        } else {
            i10 = R.string.SelectEmoji;
        }
        y7Var.setTitle(LocaleController.getString(i10));
        this.f27688s.h1(0, 0);
    }

    @Override
    public final void F() {
        this.f27687r.x0(0);
    }

    @Override
    public int getCurrentItemTop() {
        vl0 vl0Var = this.f27687r;
        if (vl0Var.getChildCount() <= 0) {
            vl0Var.setTopGlowOffset(vl0Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = vl0Var.getChildAt(0);
        fl0 fl0Var = (fl0) vl0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(36.0f);
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || fl0Var == null || fl0Var.b() != 0) {
            top = dp;
        }
        vl0Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f27687r.getPaddingTop();
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

    public void setDelegate(sy syVar) {
        this.f27686n.setDelegate(syVar);
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f26422b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uk.y(int, int):void");
    }
}
