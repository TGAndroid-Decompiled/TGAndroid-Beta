package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import org.telegram.messenger.AndroidUtilities;
public final class md extends PopupWindow {
    public final lh.e f30525a;
    public final FrameLayout f30526b;
    public final ld f30527c;
    public final org.telegram.ui.ActionBar.u6 d;
    public ValueAnimator e;
    public Bitmap f30528f;
    public boolean f30529g;
    public Runnable h;
    public final bi.i6 f30530i;

    public md(org.telegram.ui.lk lkVar, org.telegram.ui.ActionBar.u6 u6Var, ch.b bVar) {
        super(lkVar.getContext());
        this.f30530i = new bi.i6(this, 8);
        this.f30525a = lkVar;
        this.f30526b = lkVar.getContainer();
        this.d = u6Var;
        ld ldVar = new ld(this, bVar);
        this.f30527c = ldVar;
        setContentView(ldVar);
        setBackgroundDrawable(new ColorDrawable(0));
        setFocusable(true);
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(2);
        setAnimationStyle(0);
        setOnDismissListener(new org.telegram.ui.ActionBar.c0(1, this, lkVar));
    }

    public final void b(int i10, String str, boolean z10, Runnable runnable) {
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, this.f30526b.getContext(), this.d, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        g1Var.j(str, i10, null);
        if (z10) {
            i11 = org.telegram.ui.ActionBar.y6.f23579p7;
        } else {
            i11 = org.telegram.ui.ActionBar.y6.E8;
        }
        if (z10) {
            i12 = org.telegram.ui.ActionBar.y6.f23579p7;
        } else {
            i12 = org.telegram.ui.ActionBar.y6.F8;
        }
        g1Var.c(i11, i12);
        if (z10) {
            i13 = org.telegram.ui.ActionBar.y6.f23579p7;
        } else {
            i13 = org.telegram.ui.ActionBar.y6.E8;
        }
        g1Var.h(0.12f, i13);
        g1Var.setOnClickListener(new ga(2, this, runnable));
        this.f30527c.f30170a.addView(g1Var, gb1.r(-1, 48));
    }

    public final void c(float f7) {
        long j10;
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.e.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f30527c.f30174n, f7);
        this.e = ofFloat;
        if (f7 == 1.0f) {
            j10 = 280;
        } else {
            j10 = 200;
        }
        ofFloat.setDuration(j10);
        this.e.setInterpolator(ds.h);
        this.e.addUpdateListener(new n6(this, 8));
        this.e.addListener(new org.telegram.ui.ActionBar.a1(this, f7, 5));
        this.e.start();
    }

    public final void d() {
        this.h = null;
        super.dismiss();
    }

    @Override
    public final void dismiss() {
        if (isShowing() && !this.f30529g) {
            this.f30529g = true;
            c(0.0f);
        }
    }
}
