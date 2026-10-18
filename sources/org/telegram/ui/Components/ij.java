package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ij extends li {
    public ai.u1 f27239n;
    public int f27240r;
    public di.k f27241s;
    public za v;
    public int f27242w;
    public q0.a f27243x;

    @Override
    public final void B(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ij.B(int, int):void");
    }

    @Override
    public final void G(li liVar) {
        ti tiVar = this.f28238b;
        try {
            tiVar.f30558a1.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        tiVar.f30558a1.setTitle(LocaleController.getString(R.string.SelectColor));
        this.f27241s.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f27239n.x0(0);
    }

    @Override
    public int getCurrentItemTop() {
        ai.u1 u1Var = this.f27239n;
        if (u1Var.getChildCount() <= 0) {
            u1Var.setTopGlowOffset(u1Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = u1Var.getChildAt(0);
        sl0 sl0Var = (sl0) u1Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || sl0Var == null || sl0Var.b() != 0) {
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
        return this.f27239n.getPaddingTop();
    }

    @Override
    public final int i() {
        return 1;
    }

    public void setDelegate(q0.a aVar) {
        this.f27243x = aVar;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f28238b.getSheetContainer().invalidate();
        invalidate();
    }
}
