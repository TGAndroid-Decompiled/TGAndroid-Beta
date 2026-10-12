package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class qk extends ni {
    public final wz f28624n;
    public final mm0 f28625r;
    public final s4.b0 f28626s;
    public final HorizontalScrollView v;
    public final boolean f28627w;

    public qk(vi viVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, c6Var, viVar);
        this.f28627w = z10;
        this.f27673f = true;
        org.telegram.ui.ActionBar.m2 m2Var = viVar.f30001f0;
        boolean z11 = !z10 ? 1 : 0;
        wz wzVar = new wz(m2Var, z11, z10, false, getContext(), true, null, null, false, c6Var, false, true);
        this.f28624n = wzVar;
        wzVar.f31076w0 = false;
        wzVar.I(z11, z10, false, false);
        wzVar.f31048n2 = true;
        lx lxVar = wzVar.f31079x;
        if (lxVar != null) {
            lxVar.setVisibility(8);
        }
        wzVar.f31051o2 = true;
        ImageView imageView = wzVar.f31083y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        wzVar.M2 = true;
        addView(wzVar, w7.a6.d(-1.0f, -1));
        HorizontalScrollView z12 = wzVar.z(z11 ? 1 : 0);
        this.v = z12;
        mm0 y3 = wzVar.y(z11 ? 1 : 0);
        this.f28625r = y3;
        y3.j(new ah.d0(this, 21));
        this.f28626s = (s4.b0) y3.getLayoutManager();
        z12.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qk.B(int, int):void");
    }

    @Override
    public final void G(ni niVar) {
        int i10;
        vi viVar = this.f27671b;
        try {
            viVar.f29985a1.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        b8 b8Var = viVar.f29985a1;
        if (this.f28627w) {
            i10 = R.string.SelectSticker;
        } else {
            i10 = R.string.SelectEmoji;
        }
        b8Var.setTitle(LocaleController.getString(i10));
        this.f28626s.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f28625r.x0(0);
    }

    @Override
    public int getCurrentItemTop() {
        mm0 mm0Var = this.f28625r;
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
        return this.f28625r.getPaddingTop();
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

    public void setDelegate(wy wyVar) {
        this.f28624n.setDelegate(wyVar);
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f27671b.getSheetContainer().invalidate();
        invalidate();
    }
}
