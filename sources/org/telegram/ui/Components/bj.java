package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class bj extends fi {
    public jh.e1 f27120n;
    public int f27121r;
    public mh.k f27122s;
    public wa v;
    public int f27123w;
    public q0.a f27124x;

    @Override
    public final void D(fi fiVar) {
        ni niVar = this.f28403b;
        try {
            niVar.T0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        niVar.T0.setTitle(LocaleController.getString(R.string.SelectColor));
        this.f27122s.h1(0, 0);
    }

    @Override
    public final void F() {
        this.f27120n.x0(0);
    }

    @Override
    public int getCurrentItemTop() {
        jh.e1 e1Var = this.f27120n;
        if (e1Var.getChildCount() <= 0) {
            e1Var.setTopGlowOffset(e1Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = e1Var.getChildAt(0);
        vk0 vk0Var = (vk0) e1Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || vk0Var == null || vk0Var.b() != 0) {
            top = dp;
        }
        e1Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f27120n.getPaddingTop();
    }

    @Override
    public final int h() {
        return 1;
    }

    public void setDelegate(q0.a aVar) {
        this.f27124x = aVar;
    }

    @Override
    public void setTranslationY(float f9) {
        super.setTranslationY(f9);
        this.f28403b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void y(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bj.y(int, int):void");
    }
}
