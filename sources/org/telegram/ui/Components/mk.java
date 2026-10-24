package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mk extends ji {
    public final rz f28616n;
    public final lm0 f28617r;
    public final s4.b0 f28618s;
    public final HorizontalScrollView v;
    public final boolean f28619w;

    public mk(ri riVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        super(context, g6Var, riVar);
        this.f28619w = z10;
        this.f27706f = true;
        org.telegram.ui.ActionBar.o2 o2Var = riVar.f30146f0;
        boolean z11 = !z10 ? 1 : 0;
        rz rzVar = new rz(o2Var, z11, z10, false, getContext(), true, null, null, false, g6Var, false, true);
        this.f28616n = rzVar;
        rzVar.f30372w0 = false;
        rzVar.I(z11, z10, false, false);
        rzVar.f30347o2 = true;
        fx fxVar = rzVar.f30375x;
        if (fxVar != null) {
            fxVar.setVisibility(8);
        }
        rzVar.f30350p2 = true;
        ImageView imageView = rzVar.f30379y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        rzVar.S2 = true;
        addView(rzVar, w7.z5.c(-1.0f, -1));
        HorizontalScrollView z12 = rzVar.z(z11 ? 1 : 0);
        this.v = z12;
        lm0 y3 = rzVar.y(z11 ? 1 : 0);
        this.f28617r = y3;
        y3.j(new ah.d0(this, 25));
        this.f28618s = (s4.b0) y3.getLayoutManager();
        z12.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mk.B(int, int):void");
    }

    @Override
    public final void F(ji jiVar) {
        int i10;
        ri riVar = this.f27704b;
        try {
            riVar.f30130a1.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        x7 x7Var = riVar.f30130a1;
        if (this.f28619w) {
            i10 = R.string.SelectSticker;
        } else {
            i10 = R.string.SelectEmoji;
        }
        x7Var.setTitle(LocaleController.getString(i10));
        this.f28618s.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f28617r.x0(0);
    }

    @Override
    public int getCurrentItemTop() {
        lm0 lm0Var = this.f28617r;
        if (lm0Var.getChildCount() <= 0) {
            lm0Var.setTopGlowOffset(lm0Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = lm0Var.getChildAt(0);
        vl0 vl0Var = (vl0) lm0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(36.0f);
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || vl0Var == null || vl0Var.b() != 0) {
            top = dp;
        }
        lm0Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f28617r.getPaddingTop();
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

    public void setDelegate(sy syVar) {
        this.f28616n.setDelegate(syVar);
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f27704b.getSheetContainer().invalidate();
        invalidate();
    }
}
