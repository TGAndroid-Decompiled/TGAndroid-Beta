package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ok extends li {
    public final sz f31319n;
    public final mm0 f31320r;
    public final s4.c0 f31321s;
    public final HorizontalScrollView v;
    public final boolean f31322w;

    public ok(ti tiVar, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context, u6Var, tiVar);
        this.f31322w = z10;
        this.f30217f = true;
        org.telegram.ui.ActionBar.r2 r2Var = tiVar.f33021f0;
        boolean z11 = !z10 ? 1 : 0;
        sz szVar = new sz(r2Var, z11, z10, false, getContext(), true, null, null, false, u6Var, false, true);
        this.f31319n = szVar;
        szVar.f32781w0 = false;
        szVar.I(z11, z10, false, false);
        szVar.f32756o2 = true;
        gx gxVar = szVar.f32784x;
        if (gxVar != null) {
            gxVar.setVisibility(8);
        }
        szVar.f32759p2 = true;
        ImageView imageView = szVar.f32788y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        szVar.Q2 = true;
        addView(szVar, gb1.g(-1.0f, -1));
        HorizontalScrollView y3 = szVar.y(z11 ? 1 : 0);
        this.v = y3;
        mm0 x9 = szVar.x(z11 ? 1 : 0);
        this.f31320r = x9;
        x9.j(new ai.b(this, 29));
        this.f31321s = (s4.c0) x9.getLayoutManager();
        y3.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ok.B(int, int):void");
    }

    @Override
    public final void G(li liVar) {
        int i10;
        ti tiVar = this.f30215b;
        try {
            tiVar.f33005a1.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        b8 b8Var = tiVar.f33005a1;
        if (this.f31322w) {
            i10 = R.string.SelectSticker;
        } else {
            i10 = R.string.SelectEmoji;
        }
        b8Var.setTitle(LocaleController.getString(i10));
        this.f31321s.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f31320r.y0(0);
    }

    @Override
    public int getCurrentItemTop() {
        mm0 mm0Var = this.f31320r;
        if (mm0Var.getChildCount() <= 0) {
            mm0Var.setTopGlowOffset(mm0Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = mm0Var.getChildAt(0);
        vl0 vl0Var = (vl0) mm0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(36.0f);
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || vl0Var == null || vl0Var.b() != 0) {
            top = dp;
        }
        mm0Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f31320r.getPaddingTop();
    }

    @Override
    public final int i() {
        return 1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.v.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    public void setDelegate(ty tyVar) {
        this.f31319n.setDelegate(tyVar);
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30215b.getSheetContainer().invalidate();
        invalidate();
    }
}
