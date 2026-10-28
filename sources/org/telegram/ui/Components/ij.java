package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ij extends li {
    public bi.r1 f29340n;
    public int f29341r;
    public ei.k f29342s;
    public za v;
    public int f29343w;
    public q0.a f29344x;

    @Override
    public final void B(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ij.B(int, int):void");
    }

    @Override
    public final void G(li liVar) {
        ti tiVar = this.f30254b;
        try {
            tiVar.f32974a1.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        tiVar.f32974a1.setTitle(LocaleController.getString(R.string.SelectColor));
        this.f29342s.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f29340n.y0(0);
    }

    @Override
    public int getCurrentItemTop() {
        bi.r1 r1Var = this.f29340n;
        if (r1Var.getChildCount() <= 0) {
            r1Var.setTopGlowOffset(r1Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = r1Var.getChildAt(0);
        wl0 wl0Var = (wl0) r1Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || wl0Var == null || wl0Var.b() != 0) {
            top = dp;
        }
        r1Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f29340n.getPaddingTop();
    }

    @Override
    public final int i() {
        return 1;
    }

    public void setDelegate(q0.a aVar) {
        this.f29344x = aVar;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30254b.getSheetContainer().invalidate();
        invalidate();
    }
}
