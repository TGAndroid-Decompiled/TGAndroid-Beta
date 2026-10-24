package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gj extends ji {
    public ai.u1 f26698n;
    public int f26699r;
    public di.k f26700s;
    public xa v;
    public int f26701w;
    public q0.a f26702x;

    @Override
    public final void B(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gj.B(int, int):void");
    }

    @Override
    public final void F(ji jiVar) {
        ri riVar = this.f27704b;
        try {
            riVar.f30130a1.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        riVar.f30130a1.setTitle(LocaleController.getString(R.string.SelectColor));
        this.f26700s.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f26698n.x0(0);
    }

    @Override
    public int getCurrentItemTop() {
        ai.u1 u1Var = this.f26698n;
        if (u1Var.getChildCount() <= 0) {
            u1Var.setTopGlowOffset(u1Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = u1Var.getChildAt(0);
        vl0 vl0Var = (vl0) u1Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || vl0Var == null || vl0Var.b() != 0) {
            top = dp;
        }
        u1Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f26698n.getPaddingTop();
    }

    @Override
    public final int i() {
        return 1;
    }

    public void setDelegate(q0.a aVar) {
        this.f26702x = aVar;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f27704b.getSheetContainer().invalidate();
        invalidate();
    }
}
