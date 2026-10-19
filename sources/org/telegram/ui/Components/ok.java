package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ok extends li {
    public final tz f29013n;
    public final im0 f29014r;
    public final s4.b0 f29015s;
    public final HorizontalScrollView v;
    public final boolean f29016w;

    public ok(ti tiVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, d6Var, tiVar);
        this.f29016w = z10;
        this.f28227f = true;
        org.telegram.ui.ActionBar.n2 n2Var = tiVar.f30536f0;
        boolean z11 = !z10 ? 1 : 0;
        tz tzVar = new tz(n2Var, z11, z10, false, getContext(), true, null, null, false, d6Var, false, true);
        this.f29013n = tzVar;
        tzVar.f30832w0 = false;
        tzVar.I(z11, z10, false, false);
        tzVar.f30804n2 = true;
        hx hxVar = tzVar.f30835x;
        if (hxVar != null) {
            hxVar.setVisibility(8);
        }
        tzVar.f30807o2 = true;
        ImageView imageView = tzVar.f30839y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        tzVar.M2 = true;
        addView(tzVar, w7.z5.c(-1.0f, -1));
        HorizontalScrollView z12 = tzVar.z(z11 ? 1 : 0);
        this.v = z12;
        im0 y3 = tzVar.y(z11 ? 1 : 0);
        this.f29014r = y3;
        y3.j(new ah.d0(this, 25));
        this.f29015s = (s4.b0) y3.getLayoutManager();
        z12.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ok.B(int, int):void");
    }

    @Override
    public final void F(li liVar) {
        int i10;
        ti tiVar = this.f28225b;
        try {
            tiVar.f30520a1.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        z7 z7Var = tiVar.f30520a1;
        if (this.f29016w) {
            i10 = R.string.SelectSticker;
        } else {
            i10 = R.string.SelectEmoji;
        }
        z7Var.setTitle(LocaleController.getString(i10));
        this.f29015s.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f29014r.x0(0);
    }

    @Override
    public int getCurrentItemTop() {
        im0 im0Var = this.f29014r;
        if (im0Var.getChildCount() <= 0) {
            im0Var.setTopGlowOffset(im0Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = im0Var.getChildAt(0);
        sl0 sl0Var = (sl0) im0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(36.0f);
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || sl0Var == null || sl0Var.b() != 0) {
            top = dp;
        }
        im0Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f29014r.getPaddingTop();
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
        this.f29013n.setDelegate(uyVar);
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f28225b.getSheetContainer().invalidate();
        invalidate();
    }
}
