package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ij extends li {
    public bi.r1 f29295n;
    public int f29296r;
    public ei.k f29297s;
    public za v;
    public int f29298w;
    public q0.a f29299x;

    @Override
    public final void B(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ij.B(int, int):void");
    }

    @Override
    public final void G(li liVar) {
        ti tiVar = this.f30213b;
        try {
            tiVar.f33002a1.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        tiVar.f33002a1.setTitle(LocaleController.getString(R.string.SelectColor));
        this.f29297s.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f29295n.y0(0);
    }

    @Override
    public int getCurrentItemTop() {
        bi.r1 r1Var = this.f29295n;
        if (r1Var.getChildCount() <= 0) {
            r1Var.setTopGlowOffset(r1Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = r1Var.getChildAt(0);
        vl0 vl0Var = (vl0) r1Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || vl0Var == null || vl0Var.b() != 0) {
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
        return this.f29295n.getPaddingTop();
    }

    @Override
    public final int i() {
        return 1;
    }

    public void setDelegate(q0.a aVar) {
        this.f29299x = aVar;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30213b.getSheetContainer().invalidate();
        invalidate();
    }
}
