package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class bj extends ei {
    public mh.d1 f25612n;
    public int f25613r;
    public zi f25614s;
    public ra v;
    public int f25615w;
    public q0.a f25616x;

    @Override
    public final void D(ei eiVar) {
        mi miVar = this.f26590b;
        try {
            miVar.U0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        miVar.U0.setTitle(LocaleController.getString(R.string.SelectColor));
        this.f25614s.h1(0, 0);
    }

    @Override
    public final void F() {
        this.f25612n.x0(0);
    }

    @Override
    public int getCurrentItemTop() {
        mh.d1 d1Var = this.f25612n;
        if (d1Var.getChildCount() <= 0) {
            d1Var.setTopGlowOffset(d1Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = d1Var.getChildAt(0);
        el0 el0Var = (el0) d1Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || el0Var == null || el0Var.b() != 0) {
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
        return this.f25612n.getPaddingTop();
    }

    @Override
    public final int h() {
        return 1;
    }

    public void setDelegate(q0.a aVar) {
        this.f25616x = aVar;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f26590b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void y(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bj.y(int, int):void");
    }
}
