package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class al extends org.telegram.ui.Components.pk0 {
    public final int[] f32663i1;
    public ValueAnimator f32664j1;
    public boolean f32665k1;
    public final xn l1;

    public al(xn xnVar, xn xnVar2, Activity activity, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(3, i10, activity, xnVar2, f6Var);
        this.l1 = xnVar;
        this.f32663i1 = new int[2];
        this.f32665k1 = true;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.k kVar;
        int i14;
        super.onLayout(z4, i10, i11, i12, i13);
        kVar = ((org.telegram.ui.ActionBar.p2) this.l1).actionBar;
        org.telegram.ui.ActionBar.w0 k10 = kVar.j(null).k(28);
        if (k10 != null) {
            int[] iArr = this.f32663i1;
            getLocationInWindow(iArr);
            float x10 = getX();
            float width = getWidth() + x10;
            k10.getLocationInWindow(iArr);
            float width2 = (k10.getWidth() / 2.0f) + iArr[0];
            int dp = AndroidUtilities.dp(20.0f);
            boolean z10 = LocaleController.isRTL;
            if (z10) {
                i14 = -1;
            } else {
                i14 = 1;
            }
            float f10 = width2 + (dp * i14);
            if (z10) {
                s(f10 - x10, !this.f32665k1);
            } else {
                s(f10 - width, !this.f32665k1);
            }
            this.f32665k1 = false;
        }
    }

    public final void s(float f10, boolean z4) {
        ValueAnimator valueAnimator = this.f32664j1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f32664j1 = null;
        }
        if (!z4) {
            setBubbleOffset(f10);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.R0, f10);
        this.f32664j1 = ofFloat;
        ofFloat.addUpdateListener(new e3(this, 6));
        this.f32664j1.setInterpolator(org.telegram.ui.Components.nr.h);
        this.f32664j1.setDuration(420L);
        this.f32664j1.start();
    }
}
