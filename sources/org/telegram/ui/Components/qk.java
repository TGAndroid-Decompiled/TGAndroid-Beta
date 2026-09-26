package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class qk extends oi {
    public final lz f27647n;
    public final wl0 f27648r;
    public final s4.c0 f27649s;
    public final HorizontalScrollView v;
    public final boolean f27650w;

    public qk(wi wiVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, d6Var, wiVar);
        this.f27650w = z10;
        this.f27089f = true;
        org.telegram.ui.ActionBar.m2 m2Var = wiVar.f30005f0;
        boolean z11 = !z10 ? 1 : 0;
        lz lzVar = new lz(m2Var, z11, z10, false, getContext(), true, null, null, false, d6Var, false, true);
        this.f27647n = lzVar;
        lzVar.f26298w0 = false;
        lzVar.I(z11, z10, false, false);
        lzVar.f26270n2 = true;
        bx bxVar = lzVar.f26301x;
        if (bxVar != null) {
            bxVar.setVisibility(8);
        }
        lzVar.f26273o2 = true;
        ImageView imageView = lzVar.f26305y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        lzVar.M2 = true;
        addView(lzVar, w7.y5.c(-1.0f, -1));
        HorizontalScrollView y3 = lzVar.y(z11 ? 1 : 0);
        this.v = y3;
        wl0 x10 = lzVar.x(z11 ? 1 : 0);
        this.f27648r = x10;
        x10.j(new ai.r(this, 20));
        this.f27649s = (s4.c0) x10.getLayoutManager();
        y3.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override
    public final void E(oi oiVar) {
        int i10;
        wi wiVar = this.f27087b;
        try {
            wiVar.X0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        y7 y7Var = wiVar.X0;
        if (this.f27650w) {
            i10 = R.string.SelectSticker;
        } else {
            i10 = R.string.SelectEmoji;
        }
        y7Var.setTitle(LocaleController.getString(i10));
        this.f27649s.h1(0, 0);
    }

    @Override
    public final void G() {
        this.f27648r.x0(0);
    }

    @Override
    public int getCurrentItemTop() {
        wl0 wl0Var = this.f27648r;
        if (wl0Var.getChildCount() <= 0) {
            wl0Var.setTopGlowOffset(wl0Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = wl0Var.getChildAt(0);
        gl0 gl0Var = (gl0) wl0Var.G(childAt);
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
        return this.f27648r.getPaddingTop();
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

    public void setDelegate(my myVar) {
        this.f27647n.setDelegate(myVar);
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f27087b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qk.y(int, int):void");
    }
}
