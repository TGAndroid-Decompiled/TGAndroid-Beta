package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class nj extends qi {
    public ai.w0 f29163n;
    public int f29164r;
    public bi.l f29165s;
    public cb v;
    public int f29166w;
    public q0.a f29167x;

    @Override
    public final void C(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nj.C(int, int):void");
    }

    @Override
    public final void G(qi qiVar) {
        yi yiVar = this.f30173b;
        try {
            yiVar.f33211a1.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        yiVar.f33211a1.setTitle(LocaleController.getString(R.string.SelectColor));
        this.f29165s.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f29163n.x0(0);
    }

    @Override
    public int getCurrentItemTop() {
        ai.w0 w0Var = this.f29163n;
        if (w0Var.getChildCount() <= 0) {
            w0Var.setTopGlowOffset(w0Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = w0Var.getChildAt(0);
        am0 am0Var = (am0) w0Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || am0Var == null || am0Var.b() != 0) {
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
        return this.f29163n.getPaddingTop();
    }

    @Override
    public final int i() {
        return 1;
    }

    public void setDelegate(q0.a aVar) {
        this.f29167x = aVar;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30173b.getSheetContainer().invalidate();
        invalidate();
    }
}
