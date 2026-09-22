package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class pk extends ni {
    public final kz f27066n;
    public final ll0 f27067r;
    public final s4.c0 f27068s;
    public final HorizontalScrollView v;
    public final boolean f27069w;

    public pk(vi viVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var, viVar);
        this.f27069w = z10;
        this.f26463f = true;
        org.telegram.ui.ActionBar.n2 n2Var = viVar.f28747f0;
        boolean z11 = !z10 ? 1 : 0;
        kz kzVar = new kz(n2Var, z11, z10, false, getContext(), true, null, null, false, e6Var, false, true);
        this.f27066n = kzVar;
        kzVar.f25762w0 = false;
        kzVar.I(z11, z10, false, false);
        kzVar.f25734n2 = true;
        zw zwVar = kzVar.f25765x;
        if (zwVar != null) {
            zwVar.setVisibility(8);
        }
        kzVar.f25737o2 = true;
        ImageView imageView = kzVar.f25769y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        kzVar.M2 = true;
        addView(kzVar, w7.x5.c(-1.0f, -1));
        HorizontalScrollView y3 = kzVar.y(z11 ? 1 : 0);
        this.v = y3;
        ll0 x10 = kzVar.x(z11 ? 1 : 0);
        this.f27067r = x10;
        x10.j(new ai.r(this, 21));
        this.f27068s = (s4.c0) x10.getLayoutManager();
        y3.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override
    public final void E(ni niVar) {
        int i10;
        vi viVar = this.f26461b;
        try {
            viVar.X0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        w7 w7Var = viVar.X0;
        if (this.f27069w) {
            i10 = R.string.SelectSticker;
        } else {
            i10 = R.string.SelectEmoji;
        }
        w7Var.setTitle(LocaleController.getString(i10));
        this.f27068s.h1(0, 0);
    }

    @Override
    public final void G() {
        this.f27067r.x0(0);
    }

    @Override
    public int getCurrentItemTop() {
        ll0 ll0Var = this.f27067r;
        if (ll0Var.getChildCount() <= 0) {
            ll0Var.setTopGlowOffset(ll0Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = ll0Var.getChildAt(0);
        vk0 vk0Var = (vk0) ll0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(36.0f);
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || vk0Var == null || vk0Var.b() != 0) {
            top = dp;
        }
        ll0Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f27067r.getPaddingTop();
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
        this.f27066n.setDelegate(kyVar);
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f26461b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pk.y(int, int):void");
    }
}
