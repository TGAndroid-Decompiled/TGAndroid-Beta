package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class vk extends si {
    public final d00 f31560n;
    public final wm0 f31561r;
    public final s4.d0 f31562s;
    public final HorizontalScrollView v;
    public final boolean f31563w;

    public vk(aj ajVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, c6Var, ajVar);
        this.f31563w = z10;
        this.f30577f = true;
        org.telegram.ui.ActionBar.m2 m2Var = ajVar.f24342f0;
        boolean z11 = !z10 ? 1 : 0;
        d00 d00Var = new d00(m2Var, z11, z10, false, getContext(), true, null, null, false, c6Var, false, true);
        this.f31560n = d00Var;
        d00Var.f25143w0 = false;
        d00Var.I(z11, z10, false, false);
        d00Var.f25115n2 = true;
        sx sxVar = d00Var.f25146x;
        if (sxVar != null) {
            sxVar.setVisibility(8);
        }
        d00Var.f25118o2 = true;
        ImageView imageView = d00Var.f25150y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        d00Var.M2 = true;
        addView(d00Var, w7.w5.d(-1.0f, -1));
        HorizontalScrollView z12 = d00Var.z(z11 ? 1 : 0);
        this.v = z12;
        wm0 y3 = d00Var.y(z11 ? 1 : 0);
        this.f31561r = y3;
        y3.j(new ai.r(this, 20));
        this.f31562s = (s4.d0) y3.getLayoutManager();
        z12.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vk.B(int, int):void");
    }

    @Override
    public final void G(si siVar) {
        int i10;
        aj ajVar = this.f30574b;
        try {
            ajVar.f24325a1.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        a8 a8Var = ajVar.f24325a1;
        if (this.f31563w) {
            i10 = R.string.SelectSticker;
        } else {
            i10 = R.string.SelectEmoji;
        }
        a8Var.setTitle(LocaleController.getString(i10));
        this.f31562s.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f31561r.x0(0);
    }

    @Override
    public int getCurrentItemTop() {
        wm0 wm0Var = this.f31561r;
        if (wm0Var.getChildCount() <= 0) {
            wm0Var.setTopGlowOffset(wm0Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = wm0Var.getChildAt(0);
        gm0 gm0Var = (gm0) wm0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(36.0f);
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || gm0Var == null || gm0Var.b() != 0) {
            top = dp;
        }
        wm0Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f31561r.getPaddingTop();
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

    public void setDelegate(dz dzVar) {
        this.f31560n.setDelegate(dzVar);
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30574b.getSheetContainer().invalidate();
        invalidate();
    }
}
