package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kj extends ni {
    public bi.o0 f26708n;
    public int f26709r;
    public ci.k f26710s;
    public bb v;
    public int f26711w;
    public q0.a f26712x;

    @Override
    public final void B(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kj.B(int, int):void");
    }

    @Override
    public final void G(ni niVar) {
        vi viVar = this.f27671b;
        try {
            viVar.f29985a1.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        viVar.f29985a1.setTitle(LocaleController.getString(R.string.SelectColor));
        this.f26710s.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f26708n.x0(0);
    }

    @Override
    public int getCurrentItemTop() {
        bi.o0 o0Var = this.f26708n;
        if (o0Var.getChildCount() <= 0) {
            o0Var.setTopGlowOffset(o0Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = o0Var.getChildAt(0);
        wl0 wl0Var = (wl0) o0Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || wl0Var == null || wl0Var.b() != 0) {
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
        return this.f26708n.getPaddingTop();
    }

    @Override
    public final int i() {
        return 1;
    }

    public void setDelegate(q0.a aVar) {
        this.f26712x = aVar;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f27671b.getSheetContainer().invalidate();
        invalidate();
    }
}
