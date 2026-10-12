package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class pj extends si {
    public ai.w0 f29504n;
    public int f29505r;
    public bi.l f29506s;
    public bb v;
    public int f29507w;
    public q0.a f29508x;

    @Override
    public final void B(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pj.B(int, int):void");
    }

    @Override
    public final void G(si siVar) {
        aj ajVar = this.f30574b;
        try {
            ajVar.f24325a1.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        ajVar.f24325a1.setTitle(LocaleController.getString(R.string.SelectColor));
        this.f29506s.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f29504n.x0(0);
    }

    @Override
    public int getCurrentItemTop() {
        ai.w0 w0Var = this.f29504n;
        if (w0Var.getChildCount() <= 0) {
            w0Var.setTopGlowOffset(w0Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = w0Var.getChildAt(0);
        gm0 gm0Var = (gm0) w0Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || gm0Var == null || gm0Var.b() != 0) {
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
        return this.f29504n.getPaddingTop();
    }

    @Override
    public final int i() {
        return 1;
    }

    public void setDelegate(q0.a aVar) {
        this.f29508x = aVar;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30574b.getSheetContainer().invalidate();
        invalidate();
    }
}
