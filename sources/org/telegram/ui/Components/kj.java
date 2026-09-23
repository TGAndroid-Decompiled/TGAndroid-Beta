package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kj extends oi {
    public ai.w0 f25607n;
    public int f25608r;
    public bi.l f25609s;
    public za v;
    public int f25610w;
    public q0.a f25611x;

    @Override
    public final void E(oi oiVar) {
        wi wiVar = this.f26744b;
        try {
            wiVar.X0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        wiVar.X0.setTitle(LocaleController.getString(R.string.SelectColor));
        this.f25609s.h1(0, 0);
    }

    @Override
    public final void G() {
        this.f25607n.x0(0);
    }

    @Override
    public int getCurrentItemTop() {
        ai.w0 w0Var = this.f25607n;
        if (w0Var.getChildCount() <= 0) {
            w0Var.setTopGlowOffset(w0Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = w0Var.getChildAt(0);
        wk0 wk0Var = (wk0) w0Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || wk0Var == null || wk0Var.b() != 0) {
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
        return this.f25607n.getPaddingTop();
    }

    @Override
    public final int h() {
        return 1;
    }

    public void setDelegate(q0.a aVar) {
        this.f25611x = aVar;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f26744b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void y(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kj.y(int, int):void");
    }
}
