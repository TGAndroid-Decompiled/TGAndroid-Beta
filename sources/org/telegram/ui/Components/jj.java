package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class jj extends ni {
    public bi.o0 f27541n;
    public int f27542r;
    public ci.k f27543s;
    public za v;
    public int f27544w;
    public q0.a f27545x;

    @Override
    public final void D(ni niVar) {
        vi viVar = this.f28781b;
        try {
            viVar.X0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        viVar.X0.setTitle(LocaleController.getString(R.string.SelectColor));
        this.f27543s.h1(0, 0);
    }

    @Override
    public final void G() {
        this.f27541n.x0(0);
    }

    @Override
    public int getCurrentItemTop() {
        bi.o0 o0Var = this.f27541n;
        if (o0Var.getChildCount() <= 0) {
            o0Var.setTopGlowOffset(o0Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = o0Var.getChildAt(0);
        vk0 vk0Var = (vk0) o0Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || vk0Var == null || vk0Var.b() != 0) {
            top = dp;
        }
        o0Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f27541n.getPaddingTop();
    }

    @Override
    public final int h() {
        return 1;
    }

    public void setDelegate(q0.a aVar) {
        this.f27545x = aVar;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f28781b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void y(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jj.y(int, int):void");
    }
}
