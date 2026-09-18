package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class pk extends ni {
    public final kz f27252n;
    public final wl0 f27253r;
    public final s4.c0 f27254s;
    public final HorizontalScrollView v;
    public final boolean f27255w;

    public pk(vi viVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var, viVar);
        this.f27255w = z10;
        this.f26690f = true;
        org.telegram.ui.ActionBar.n2 n2Var = viVar.f29021f0;
        boolean z11 = !z10 ? 1 : 0;
        kz kzVar = new kz(n2Var, z11, z10, false, getContext(), true, null, null, false, e6Var, false, true);
        this.f27252n = kzVar;
        kzVar.f25954w0 = false;
        kzVar.I(z11, z10, false, false);
        kzVar.f25926n2 = true;
        ax axVar = kzVar.f25957x;
        if (axVar != null) {
            axVar.setVisibility(8);
        }
        kzVar.f25929o2 = true;
        ImageView imageView = kzVar.f25961y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        kzVar.M2 = true;
        addView(kzVar, w7.y5.c(-1.0f, -1));
        HorizontalScrollView y3 = kzVar.y(z11 ? 1 : 0);
        this.v = y3;
        wl0 x10 = kzVar.x(z11 ? 1 : 0);
        this.f27253r = x10;
        x10.j(new ai.r(this, 21));
        this.f27254s = (s4.c0) x10.getLayoutManager();
        y3.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override
    public final void E(ni niVar) {
        int i10;
        vi viVar = this.f26688b;
        try {
            viVar.X0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        y7 y7Var = viVar.X0;
        if (this.f27255w) {
            i10 = R.string.SelectSticker;
        } else {
            i10 = R.string.SelectEmoji;
        }
        y7Var.setTitle(LocaleController.getString(i10));
        this.f27254s.h1(0, 0);
    }

    @Override
    public final void G() {
        this.f27253r.y0(0);
    }

    @Override
    public int getCurrentItemTop() {
        wl0 wl0Var = this.f27253r;
        if (wl0Var.getChildCount() <= 0) {
            wl0Var.setTopGlowOffset(wl0Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = wl0Var.getChildAt(0);
        gl0 gl0Var = (gl0) wl0Var.H(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(36.0f);
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || gl0Var == null || gl0Var.b() != 0) {
            top = dp;
        }
        wl0Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f27253r.getPaddingTop();
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
        this.f27252n.setDelegate(lyVar);
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f26688b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pk.y(int, int):void");
    }
}
