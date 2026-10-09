package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class tk extends qi {
    public final a00 f31216n;
    public final qm0 f31217r;
    public final s4.d0 f31218s;
    public final HorizontalScrollView v;
    public final boolean f31219w;

    public tk(yi yiVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var, yiVar);
        this.f31219w = z10;
        this.f30176f = true;
        org.telegram.ui.ActionBar.n2 n2Var = yiVar.f33228f0;
        boolean z11 = !z10 ? 1 : 0;
        a00 a00Var = new a00(n2Var, z11, z10, false, getContext(), true, null, null, false, e6Var, false, true);
        this.f31216n = a00Var;
        a00Var.f24464w0 = false;
        a00Var.I(z11, z10, false, false);
        a00Var.f24436n2 = true;
        px pxVar = a00Var.f24467x;
        if (pxVar != null) {
            pxVar.setVisibility(8);
        }
        a00Var.f24439o2 = true;
        ImageView imageView = a00Var.f24471y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        a00Var.M2 = true;
        addView(a00Var, w7.x5.d(-1.0f, -1));
        HorizontalScrollView z12 = a00Var.z(z11 ? 1 : 0);
        this.v = z12;
        qm0 y3 = a00Var.y(z11 ? 1 : 0);
        this.f31217r = y3;
        y3.j(new ai.r(this, 20));
        this.f31218s = (s4.d0) y3.getLayoutManager();
        z12.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override
    public final void C(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tk.C(int, int):void");
    }

    @Override
    public final void G(qi qiVar) {
        int i10;
        yi yiVar = this.f30173b;
        try {
            yiVar.f33211a1.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        a8 a8Var = yiVar.f33211a1;
        if (this.f31219w) {
            i10 = R.string.SelectSticker;
        } else {
            i10 = R.string.SelectEmoji;
        }
        a8Var.setTitle(LocaleController.getString(i10));
        this.f31218s.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f31217r.x0(0);
    }

    @Override
    public int getCurrentItemTop() {
        qm0 qm0Var = this.f31217r;
        if (qm0Var.getChildCount() <= 0) {
            qm0Var.setTopGlowOffset(qm0Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = qm0Var.getChildAt(0);
        am0 am0Var = (am0) qm0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(36.0f);
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || am0Var == null || am0Var.b() != 0) {
            top = dp;
        }
        qm0Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f31217r.getPaddingTop();
    }

    @Override
    public final int i() {
        return 1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.v.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    public void setDelegate(az azVar) {
        this.f31216n.setDelegate(azVar);
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30173b.getSheetContainer().invalidate();
        invalidate();
    }
}
