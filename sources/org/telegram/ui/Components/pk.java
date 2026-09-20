package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class pk extends ni {
    public final kz f27330n;
    public final vl0 f27331r;
    public final s4.c0 f27332s;
    public final HorizontalScrollView v;
    public final boolean f27333w;

    public pk(vi viVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context, f6Var, viVar);
        this.f27333w = z10;
        this.f26657f = true;
        org.telegram.ui.ActionBar.n2 n2Var = viVar.f29098f0;
        boolean z11 = !z10 ? 1 : 0;
        kz kzVar = new kz(n2Var, z11, z10, false, getContext(), true, null, null, false, f6Var, false, true);
        this.f27330n = kzVar;
        kzVar.f25960w0 = false;
        kzVar.I(z11, z10, false, false);
        kzVar.f25932n2 = true;
        ax axVar = kzVar.f25963x;
        if (axVar != null) {
            axVar.setVisibility(8);
        }
        kzVar.f25935o2 = true;
        ImageView imageView = kzVar.f25967y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        kzVar.M2 = true;
        addView(kzVar, w7.y5.c(-1.0f, -1));
        HorizontalScrollView y3 = kzVar.y(z11 ? 1 : 0);
        this.v = y3;
        vl0 x10 = kzVar.x(z11 ? 1 : 0);
        this.f27331r = x10;
        x10.j(new ai.r(this, 21));
        this.f27332s = (s4.c0) x10.getLayoutManager();
        y3.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override
    public final void E(ni niVar) {
        int i10;
        vi viVar = this.f26655b;
        try {
            viVar.X0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        x7 x7Var = viVar.X0;
        if (this.f27333w) {
            i10 = R.string.SelectSticker;
        } else {
            i10 = R.string.SelectEmoji;
        }
        x7Var.setTitle(LocaleController.getString(i10));
        this.f27332s.h1(0, 0);
    }

    @Override
    public final void G() {
        this.f27331r.y0(0);
    }

    @Override
    public int getCurrentItemTop() {
        vl0 vl0Var = this.f27331r;
        if (vl0Var.getChildCount() <= 0) {
            vl0Var.setTopGlowOffset(vl0Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = vl0Var.getChildAt(0);
        fl0 fl0Var = (fl0) vl0Var.H(childAt);
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
        return this.f27331r.getPaddingTop();
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
        this.f27330n.setDelegate(lyVar);
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f26655b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pk.y(int, int):void");
    }
}
