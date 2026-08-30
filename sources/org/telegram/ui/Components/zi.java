package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zi extends di {
    public lh.e1 f31347n;
    public int f31348r;
    public oh.k f31349s;
    public ra v;
    public int f31350w;
    public q0.a f31351x;

    @Override
    public final void D(di diVar) {
        li liVar = this.f24278b;
        try {
            liVar.U0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        liVar.U0.setTitle(LocaleController.getString(R.string.SelectColor));
        this.f31349s.h1(0, 0);
    }

    @Override
    public final void F() {
        this.f31347n.x0(0);
    }

    @Override
    public int getCurrentItemTop() {
        lh.e1 e1Var = this.f31347n;
        if (e1Var.getChildCount() <= 0) {
            e1Var.setTopGlowOffset(e1Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = e1Var.getChildAt(0);
        el0 el0Var = (el0) e1Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || el0Var == null || el0Var.b() != 0) {
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
        return this.f31347n.getPaddingTop();
    }

    @Override
    public final int h() {
        return 1;
    }

    public void setDelegate(q0.a aVar) {
        this.f31351x = aVar;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f24278b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void y(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zi.y(int, int):void");
    }
}
