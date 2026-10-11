package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class tk extends qi {
    public final b00 f31285n;
    public final rm0 f31286r;
    public final s4.d0 f31287s;
    public final HorizontalScrollView v;
    public final boolean f31288w;

    public tk(yi yiVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, d6Var, yiVar);
        this.f31288w = z10;
        this.f30248f = true;
        org.telegram.ui.ActionBar.m2 m2Var = yiVar.f33289f0;
        boolean z11 = !z10 ? 1 : 0;
        b00 b00Var = new b00(m2Var, z11, z10, false, getContext(), true, null, null, false, d6Var, false, true);
        this.f31285n = b00Var;
        b00Var.f24794w0 = false;
        b00Var.I(z11, z10, false, false);
        b00Var.f24766n2 = true;
        qx qxVar = b00Var.f24797x;
        if (qxVar != null) {
            qxVar.setVisibility(8);
        }
        b00Var.f24769o2 = true;
        ImageView imageView = b00Var.f24801y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        b00Var.M2 = true;
        addView(b00Var, w7.x5.d(-1.0f, -1));
        HorizontalScrollView z12 = b00Var.z(z11 ? 1 : 0);
        this.v = z12;
        rm0 y3 = b00Var.y(z11 ? 1 : 0);
        this.f31286r = y3;
        y3.j(new ai.r(this, 20));
        this.f31287s = (s4.d0) y3.getLayoutManager();
        z12.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override
    public final void C(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tk.C(int, int):void");
    }

    @Override
    public final void G(qi qiVar) {
        int i10;
        yi yiVar = this.f30245b;
        try {
            yiVar.f33272a1.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        a8 a8Var = yiVar.f33272a1;
        if (this.f31288w) {
            i10 = R.string.SelectSticker;
        } else {
            i10 = R.string.SelectEmoji;
        }
        a8Var.setTitle(LocaleController.getString(i10));
        this.f31287s.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f31286r.x0(0);
    }

    @Override
    public int getCurrentItemTop() {
        rm0 rm0Var = this.f31286r;
        if (rm0Var.getChildCount() <= 0) {
            rm0Var.setTopGlowOffset(rm0Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = rm0Var.getChildAt(0);
        bm0 bm0Var = (bm0) rm0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(36.0f);
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || bm0Var == null || bm0Var.b() != 0) {
            top = dp;
        }
        rm0Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f31286r.getPaddingTop();
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

    public void setDelegate(bz bzVar) {
        this.f31285n.setDelegate(bzVar);
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30245b.getSheetContainer().invalidate();
        invalidate();
    }
}
