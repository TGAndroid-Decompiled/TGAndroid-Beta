package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ok extends li {
    public final tz f29223n;
    public final mm0 f29224r;
    public final s4.b0 f29225s;
    public final HorizontalScrollView v;
    public final boolean f29226w;

    public ok(ti tiVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        super(context, g6Var, tiVar);
        this.f29226w = z10;
        this.f28368f = true;
        org.telegram.ui.ActionBar.o2 o2Var = tiVar.f30730f0;
        boolean z11 = !z10 ? 1 : 0;
        tz tzVar = new tz(o2Var, z11, z10, false, getContext(), true, null, null, false, g6Var, false, true);
        this.f29223n = tzVar;
        tzVar.f31028w0 = false;
        tzVar.I(z11, z10, false, false);
        tzVar.f31003o2 = true;
        hx hxVar = tzVar.f31031x;
        if (hxVar != null) {
            hxVar.setVisibility(8);
        }
        tzVar.f31006p2 = true;
        ImageView imageView = tzVar.f31035y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        tzVar.S2 = true;
        addView(tzVar, w7.z5.c(-1.0f, -1));
        HorizontalScrollView z12 = tzVar.z(z11 ? 1 : 0);
        this.v = z12;
        mm0 y3 = tzVar.y(z11 ? 1 : 0);
        this.f29224r = y3;
        y3.j(new ah.d0(this, 25));
        this.f29225s = (s4.b0) y3.getLayoutManager();
        z12.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ok.B(int, int):void");
    }

    @Override
    public final void F(li liVar) {
        int i10;
        ti tiVar = this.f28366b;
        try {
            tiVar.f30714a1.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        z7 z7Var = tiVar.f30714a1;
        if (this.f29226w) {
            i10 = R.string.SelectSticker;
        } else {
            i10 = R.string.SelectEmoji;
        }
        z7Var.setTitle(LocaleController.getString(i10));
        this.f29225s.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f29224r.x0(0);
    }

    @Override
    public int getCurrentItemTop() {
        mm0 mm0Var = this.f29224r;
        if (mm0Var.getChildCount() <= 0) {
            mm0Var.setTopGlowOffset(mm0Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = mm0Var.getChildAt(0);
        wl0 wl0Var = (wl0) mm0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(36.0f);
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || wl0Var == null || wl0Var.b() != 0) {
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
        return this.f29224r.getPaddingTop();
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

    public void setDelegate(uy uyVar) {
        this.f29223n.setDelegate(uyVar);
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f28366b.getSheetContainer().invalidate();
        invalidate();
    }
}
