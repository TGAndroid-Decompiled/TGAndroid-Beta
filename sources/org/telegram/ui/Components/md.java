package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import org.telegram.messenger.AndroidUtilities;
public final class md extends PopupWindow {
    public final lh.e f30502a;
    public final FrameLayout f30503b;
    public final ld f30504c;
    public final org.telegram.ui.ActionBar.u6 d;
    public ValueAnimator e;
    public Bitmap f30505f;
    public boolean f30506g;
    public Runnable h;
    public final bi.i6 f30507i;

    public md(org.telegram.ui.nk nkVar, org.telegram.ui.ActionBar.u6 u6Var, ch.b bVar) {
        super(nkVar.getContext());
        this.f30507i = new bi.i6(this, 8);
        this.f30502a = nkVar;
        this.f30503b = nkVar.getContainer();
        this.d = u6Var;
        ld ldVar = new ld(this, bVar);
        this.f30504c = ldVar;
        setContentView(ldVar);
        setBackgroundDrawable(new ColorDrawable(0));
        setFocusable(true);
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(2);
        setAnimationStyle(0);
        setOnDismissListener(new org.telegram.ui.ActionBar.c0(1, this, nkVar));
    }

    public final void b(int i10, String str, boolean z10, Runnable runnable) {
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, this.f30503b.getContext(), this.d, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        g1Var.j(str, i10, null);
        if (z10) {
            i11 = org.telegram.ui.ActionBar.y6.f23582p7;
        } else {
            i11 = org.telegram.ui.ActionBar.y6.E8;
        }
        if (z10) {
            i12 = org.telegram.ui.ActionBar.y6.f23582p7;
        } else {
            i12 = org.telegram.ui.ActionBar.y6.F8;
        }
        g1Var.c(i11, i12);
        if (z10) {
            i13 = org.telegram.ui.ActionBar.y6.f23582p7;
        } else {
            i13 = org.telegram.ui.ActionBar.y6.E8;
        }
        g1Var.h(0.12f, i13);
        g1Var.setOnClickListener(new ga(2, this, runnable));
        this.f30504c.f30230a.addView(g1Var, kb1.r(-1, 48));
    }

    public final void c(float f7) {
        long j10;
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.e.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f30504c.f30234n, f7);
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
        if (isShowing() && !this.f30506g) {
            this.f30506g = true;
            c(0.0f);
        }
    }
}
