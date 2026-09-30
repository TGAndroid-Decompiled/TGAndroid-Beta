package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mj extends pi {
    public ai.w0 f26304n;
    public int f26305r;
    public bi.l f26306s;
    public ab v;
    public int f26307w;
    public q0.a f26308x;

    @Override
    public final void E(pi piVar) {
        xi xiVar = this.f27362b;
        try {
            xiVar.X0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        xiVar.X0.setTitle(LocaleController.getString(R.string.SelectColor));
        this.f26306s.h1(0, 0);
    }

    @Override
    public final void G() {
        this.f26304n.y0(0);
    }

    @Override
    public int getCurrentItemTop() {
        ai.w0 w0Var = this.f26304n;
        if (w0Var.getChildCount() <= 0) {
            w0Var.setTopGlowOffset(w0Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = w0Var.getChildAt(0);
        jl0 jl0Var = (jl0) w0Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || jl0Var == null || jl0Var.b() != 0) {
            top = dp;
        }
        w0Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f26304n.getPaddingTop();
    }

    @Override
    public final int h() {
        return 1;
    }

    public void setDelegate(q0.a aVar) {
        this.f26308x = aVar;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f27362b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void y(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mj.y(int, int):void");
    }
}
