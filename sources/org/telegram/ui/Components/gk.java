package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gk extends ci {
    public final wy f28784n;
    public final wk0 f28785r;
    public final f2.m0 f28786s;
    public final HorizontalScrollView v;
    public final boolean f28787w;

    public gk(ki kiVar, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context, b6Var, kiVar);
        this.f28787w = z10;
        this.f27496f = true;
        org.telegram.ui.ActionBar.o2 o2Var = kiVar.f30099b0;
        boolean z11 = !z10 ? 1 : 0;
        wy wyVar = new wy(o2Var, z11, z10, false, getContext(), true, null, null, false, b6Var, false, true);
        this.f28784n = wyVar;
        wyVar.f34442s0 = false;
        wyVar.J(z11, z10, false, false);
        wyVar.f34419k2 = true;
        mw mwVar = wyVar.f34458x;
        if (mwVar != null) {
            mwVar.setVisibility(8);
        }
        wyVar.f34421l2 = true;
        ImageView imageView = wyVar.f34462y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        wyVar.I2 = true;
        addView(wyVar, g7.e6.c(-1.0f, -1));
        HorizontalScrollView y10 = wyVar.y(z11 ? 1 : 0);
        this.v = y10;
        wk0 x10 = wyVar.x(z11 ? 1 : 0);
        this.f28785r = x10;
        x10.j(new bg.o2(this, 27));
        this.f28786s = (f2.m0) x10.getLayoutManager();
        y10.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override
    public final void D(ci ciVar) {
        int i9;
        ki kiVar = this.f27493b;
        try {
            kiVar.T0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        r7 r7Var = kiVar.T0;
        if (this.f28787w) {
            i9 = R.string.SelectSticker;
        } else {
            i9 = R.string.SelectEmoji;
        }
        r7Var.setTitle(LocaleController.getString(i9));
        this.f28786s.h1(0, 0);
    }

    @Override
    public final void F() {
        this.f28785r.x0(0);
    }

    @Override
    public int getCurrentItemTop() {
        wk0 wk0Var = this.f28785r;
        if (wk0Var.getChildCount() <= 0) {
            wk0Var.setTopGlowOffset(wk0Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = wk0Var.getChildAt(0);
        ik0 ik0Var = (ik0) wk0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(36.0f);
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || ik0Var == null || ik0Var.b() != 0) {
            top = dp;
        }
        wk0Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f28785r.getPaddingTop();
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        this.v.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    public void setDelegate(wx wxVar) {
        this.f28784n.setDelegate(wxVar);
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f27493b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gk.y(int, int):void");
    }
}
