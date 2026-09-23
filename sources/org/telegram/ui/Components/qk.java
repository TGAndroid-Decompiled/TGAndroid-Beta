package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class qk extends oi {
    public final lz f27374n;
    public final ml0 f27375r;
    public final s4.c0 f27376s;
    public final HorizontalScrollView v;
    public final boolean f27377w;

    public qk(wi wiVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, d6Var, wiVar);
        this.f27377w = z10;
        this.f26746f = true;
        org.telegram.ui.ActionBar.n2 n2Var = wiVar.f29665f0;
        boolean z11 = !z10 ? 1 : 0;
        lz lzVar = new lz(n2Var, z11, z10, false, getContext(), true, null, null, false, d6Var, false, true);
        this.f27374n = lzVar;
        lzVar.f26030w0 = false;
        lzVar.I(z11, z10, false, false);
        lzVar.f26002n2 = true;
        ax axVar = lzVar.f26033x;
        if (axVar != null) {
            axVar.setVisibility(8);
        }
        lzVar.f26005o2 = true;
        ImageView imageView = lzVar.f26037y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        lzVar.M2 = true;
        addView(lzVar, w7.x5.c(-1.0f, -1));
        HorizontalScrollView y3 = lzVar.y(z11 ? 1 : 0);
        this.v = y3;
        ml0 x10 = lzVar.x(z11 ? 1 : 0);
        this.f27375r = x10;
        x10.j(new ai.r(this, 20));
        this.f27376s = (s4.c0) x10.getLayoutManager();
        y3.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override
    public final void E(oi oiVar) {
        int i10;
        wi wiVar = this.f26744b;
        try {
            wiVar.X0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        y7 y7Var = wiVar.X0;
        if (this.f27377w) {
            i10 = R.string.SelectSticker;
        } else {
            i10 = R.string.SelectEmoji;
        }
        y7Var.setTitle(LocaleController.getString(i10));
        this.f27376s.h1(0, 0);
    }

    @Override
    public final void G() {
        this.f27375r.x0(0);
    }

    @Override
    public int getCurrentItemTop() {
        ml0 ml0Var = this.f27375r;
        if (ml0Var.getChildCount() <= 0) {
            ml0Var.setTopGlowOffset(ml0Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = ml0Var.getChildAt(0);
        wk0 wk0Var = (wk0) ml0Var.G(childAt);
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
        return this.f27375r.getPaddingTop();
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
        this.f27374n.setDelegate(lyVar);
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f26744b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qk.y(int, int):void");
    }
}
