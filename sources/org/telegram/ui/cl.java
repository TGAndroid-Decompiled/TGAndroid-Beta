package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class cl extends org.telegram.ui.Components.pk0 {
    public final int[] f33185i1;
    public ValueAnimator f33186j1;
    public boolean f33187k1;
    public final zn l1;

    public cl(zn znVar, zn znVar2, Activity activity, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(3, i10, activity, znVar2, f6Var);
        this.l1 = znVar;
        this.f33185i1 = new int[2];
        this.f33187k1 = true;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.k kVar;
        int i14;
        super.onLayout(z4, i10, i11, i12, i13);
        kVar = ((org.telegram.ui.ActionBar.p2) this.l1).actionBar;
        org.telegram.ui.ActionBar.w0 k10 = kVar.j(null).k(28);
        if (k10 != null) {
            int[] iArr = this.f33185i1;
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
                s(f10 - x10, !this.f33187k1);
            } else {
                s(f10 - width, !this.f33187k1);
            }
            this.f33187k1 = false;
        }
    }

    public final void s(float f10, boolean z4) {
        ValueAnimator valueAnimator = this.f33186j1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f33186j1 = null;
        }
        if (!z4) {
            setBubbleOffset(f10);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.R0, f10);
        this.f33186j1 = ofFloat;
        ofFloat.addUpdateListener(new g3(this, 6));
        this.f33186j1.setInterpolator(org.telegram.ui.Components.mr.h);
        this.f33186j1.setDuration(420L);
        this.f33186j1.start();
    }
}
