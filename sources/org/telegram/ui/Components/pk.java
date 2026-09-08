package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class pk extends ni {
    public final kz f29435n;
    public final ll0 f29436r;
    public final s4.c0 f29437s;
    public final HorizontalScrollView v;
    public final boolean f29438w;

    public pk(vi viVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context, f6Var, viVar);
        this.f29438w = z10;
        this.f28783f = true;
        org.telegram.ui.ActionBar.n2 n2Var = viVar.f31306f0;
        boolean z11 = !z10 ? 1 : 0;
        kz kzVar = new kz(n2Var, z11, z10, false, getContext(), true, null, null, false, f6Var, false, true);
        this.f29435n = kzVar;
        kzVar.f28022w0 = false;
        kzVar.K(z11, z10, false, false);
        kzVar.f27997o2 = true;
        ax axVar = kzVar.f28025x;
        if (axVar != null) {
            axVar.setVisibility(8);
        }
        kzVar.f28000p2 = true;
        ImageView imageView = kzVar.f28029y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        kzVar.M2 = true;
        addView(kzVar, w7.x5.c(-1.0f, -1));
        HorizontalScrollView y3 = kzVar.y(z11 ? 1 : 0);
        this.v = y3;
        ll0 x10 = kzVar.x(z11 ? 1 : 0);
        this.f29436r = x10;
        x10.j(new ah.e0(this, 21));
        this.f29437s = (s4.c0) x10.getLayoutManager();
        y3.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override
    public final void D(ni niVar) {
        int i10;
        vi viVar = this.f28780b;
        try {
            viVar.X0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        z7 z7Var = viVar.X0;
        if (this.f29438w) {
            i10 = R.string.SelectSticker;
        } else {
            i10 = R.string.SelectEmoji;
        }
        z7Var.setTitle(LocaleController.getString(i10));
        this.f29437s.h1(0, 0);
    }

    @Override
    public final void G() {
        this.f29436r.x0(0);
    }

    @Override
    public int getCurrentItemTop() {
        ll0 ll0Var = this.f29436r;
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
        return this.f29436r.getPaddingTop();
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
        this.f29435n.setDelegate(lyVar);
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f28780b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pk.y(int, int):void");
    }
}
