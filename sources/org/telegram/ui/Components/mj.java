package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mj extends qi {
    public bi.y1 f25239n;
    public int f25240r;
    public ai.q f25241s;
    public ya v;
    public int f25242w;
    public q0.a f25243x;

    @Override
    public final void D(qi qiVar) {
        yi yiVar = this.f26422b;
        try {
            yiVar.X0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        yiVar.X0.setTitle(LocaleController.getString(R.string.SelectColor));
        this.f25241s.h1(0, 0);
    }

    @Override
    public final void F() {
        this.f25239n.x0(0);
    }

    @Override
    public int getCurrentItemTop() {
        bi.y1 y1Var = this.f25239n;
        if (y1Var.getChildCount() <= 0) {
            y1Var.setTopGlowOffset(y1Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = y1Var.getChildAt(0);
        fl0 fl0Var = (fl0) y1Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || fl0Var == null || fl0Var.b() != 0) {
            top = dp;
        }
        y1Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f25239n.getPaddingTop();
    }

    @Override
    public final int h() {
        return 1;
    }

    public void setDelegate(q0.a aVar) {
        this.f25243x = aVar;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f26422b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void y(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mj.y(int, int):void");
    }
}
