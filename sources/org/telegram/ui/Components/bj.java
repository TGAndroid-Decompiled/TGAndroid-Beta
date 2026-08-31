package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class bj extends ei {
    public mh.d1 f25601n;
    public int f25602r;
    public zi f25603s;
    public ra v;
    public int f25604w;
    public q0.a f25605x;

    @Override
    public final void D(ei eiVar) {
        mi miVar = this.f26546b;
        try {
            miVar.U0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        miVar.U0.setTitle(LocaleController.getString(R.string.SelectColor));
        this.f25603s.h1(0, 0);
    }

    @Override
    public final void F() {
        this.f25601n.x0(0);
    }

    @Override
    public int getCurrentItemTop() {
        mh.d1 d1Var = this.f25601n;
        if (d1Var.getChildCount() <= 0) {
            d1Var.setTopGlowOffset(d1Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = d1Var.getChildAt(0);
        fl0 fl0Var = (fl0) d1Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || fl0Var == null || fl0Var.b() != 0) {
            top = dp;
        }
        d1Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f25601n.getPaddingTop();
    }

    @Override
    public final int h() {
        return 1;
    }

    public void setDelegate(q0.a aVar) {
        this.f25605x = aVar;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f26546b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void y(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bj.y(int, int):void");
    }
}
