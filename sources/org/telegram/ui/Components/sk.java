package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class sk extends pi {
    public final nz f30748n;
    public final zl0 f30749r;
    public final s4.c0 f30750s;
    public final HorizontalScrollView v;
    public final boolean f30751w;

    public sk(xi xiVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, d6Var, xiVar);
        this.f30751w = z10;
        this.f29645f = true;
        org.telegram.ui.ActionBar.n2 n2Var = xiVar.f32812f0;
        boolean z11 = !z10 ? 1 : 0;
        nz nzVar = new nz(n2Var, z11, z10, false, getContext(), true, null, null, false, d6Var, false, true);
        this.f30748n = nzVar;
        nzVar.f29154w0 = false;
        nzVar.G(z11, z10, false, false);
        nzVar.f29126n2 = true;
        dx dxVar = nzVar.f29157x;
        if (dxVar != null) {
            dxVar.setVisibility(8);
        }
        nzVar.f29129o2 = true;
        ImageView imageView = nzVar.f29161y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        nzVar.K2 = true;
        addView(nzVar, w7.z5.c(-1.0f, -1));
        HorizontalScrollView y3 = nzVar.y(z11 ? 1 : 0);
        this.v = y3;
        zl0 x10 = nzVar.x(z11 ? 1 : 0);
        this.f30749r = x10;
        x10.j(new ai.r(this, 21));
        this.f30750s = (s4.c0) x10.getLayoutManager();
        y3.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override
    public final void C(pi piVar) {
        int i10;
        xi xiVar = this.f29642b;
        try {
            xiVar.X0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        y7 y7Var = xiVar.X0;
        if (this.f30751w) {
            i10 = R.string.SelectSticker;
        } else {
            i10 = R.string.SelectEmoji;
        }
        y7Var.setTitle(LocaleController.getString(i10));
        this.f30750s.h1(0, 0);
    }

    @Override
    public final void E() {
        this.f30749r.y0(0);
    }

    @Override
    public int getCurrentItemTop() {
        zl0 zl0Var = this.f30749r;
        if (zl0Var.getChildCount() <= 0) {
            zl0Var.setTopGlowOffset(zl0Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = zl0Var.getChildAt(0);
        il0 il0Var = (il0) zl0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(36.0f);
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || il0Var == null || il0Var.b() != 0) {
            top = dp;
        }
        zl0Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f30749r.getPaddingTop();
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.v.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    public void setDelegate(oy oyVar) {
        this.f30748n.setDelegate(oyVar);
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f29642b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sk.y(int, int):void");
    }
}
