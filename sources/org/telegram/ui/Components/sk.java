package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class sk extends pi {
    public final nz f30749n;
    public final zl0 f30750r;
    public final s4.c0 f30751s;
    public final HorizontalScrollView v;
    public final boolean f30752w;

    public sk(xi xiVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, d6Var, xiVar);
        this.f30752w = z10;
        this.f29646f = true;
        org.telegram.ui.ActionBar.n2 n2Var = xiVar.f32813f0;
        boolean z11 = !z10 ? 1 : 0;
        nz nzVar = new nz(n2Var, z11, z10, false, getContext(), true, null, null, false, d6Var, false, true);
        this.f30749n = nzVar;
        nzVar.f29155w0 = false;
        nzVar.G(z11, z10, false, false);
        nzVar.f29127n2 = true;
        dx dxVar = nzVar.f29158x;
        if (dxVar != null) {
            dxVar.setVisibility(8);
        }
        nzVar.f29130o2 = true;
        ImageView imageView = nzVar.f29162y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        nzVar.K2 = true;
        addView(nzVar, w7.z5.c(-1.0f, -1));
        HorizontalScrollView y3 = nzVar.y(z11 ? 1 : 0);
        this.v = y3;
        zl0 x10 = nzVar.x(z11 ? 1 : 0);
        this.f30750r = x10;
        x10.j(new ai.r(this, 21));
        this.f30751s = (s4.c0) x10.getLayoutManager();
        y3.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override
    public final void C(pi piVar) {
        int i10;
        xi xiVar = this.f29643b;
        try {
            xiVar.X0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        y7 y7Var = xiVar.X0;
        if (this.f30752w) {
            i10 = R.string.SelectSticker;
        } else {
            i10 = R.string.SelectEmoji;
        }
        y7Var.setTitle(LocaleController.getString(i10));
        this.f30751s.h1(0, 0);
    }

    @Override
    public final void E() {
        this.f30750r.y0(0);
    }

    @Override
    public int getCurrentItemTop() {
        zl0 zl0Var = this.f30750r;
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
        return this.f30750r.getPaddingTop();
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
        this.f30749n.setDelegate(oyVar);
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f29643b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sk.y(int, int):void");
    }
}
