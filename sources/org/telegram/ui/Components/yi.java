package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yi extends ci {
    public gh.f1 f34973n;
    public int f34974r;
    public jh.k f34975s;
    public ra v;
    public int f34976w;
    public q0.a f34977x;

    @Override
    public final void D(ci ciVar) {
        ki kiVar = this.f27493b;
        try {
            kiVar.T0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        kiVar.T0.setTitle(LocaleController.getString(R.string.SelectColor));
        this.f34975s.h1(0, 0);
    }

    @Override
    public final void F() {
        this.f34973n.x0(0);
    }

    @Override
    public int getCurrentItemTop() {
        gh.f1 f1Var = this.f34973n;
        if (f1Var.getChildCount() <= 0) {
            f1Var.setTopGlowOffset(f1Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = f1Var.getChildAt(0);
        ik0 ik0Var = (ik0) f1Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || ik0Var == null || ik0Var.b() != 0) {
            top = dp;
        }
        f1Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f34973n.getPaddingTop();
    }

    @Override
    public final int h() {
        return 1;
    }

    public void setDelegate(q0.a aVar) {
        this.f34977x = aVar;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f27493b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void y(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yi.y(int, int):void");
    }
}
