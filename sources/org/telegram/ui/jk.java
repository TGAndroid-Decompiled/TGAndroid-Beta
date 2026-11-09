package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
public final class jk extends org.telegram.ui.Components.ji0 {
    public final int[] f46983m1;
    public ValueAnimator n1;
    public boolean f46984o1;
    public final cn f46985p1;

    public jk(cn cnVar, cn cnVar2, Activity activity, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        super(3, i7, activity, cnVar2, g6Var);
        this.f46985p1 = cnVar;
        this.f46983m1 = new int[2];
        this.f46984o1 = true;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        super.onLayout(z9, i7, i10, i11, i12);
        kVar = ((org.telegram.ui.ActionBar.f2) this.f46985p1).actionBar;
        org.telegram.ui.ActionBar.r0 j3 = kVar.o(null).j(28);
        if (j3 != null) {
            int[] iArr = this.f46983m1;
            getLocationInWindow(iArr);
            float x10 = getX();
            float width = getWidth() + x10;
            j3.getLocationInWindow(iArr);
            float width2 = (j3.getWidth() / 2.0f) + iArr[0];
            int L = org.telegram.messenger.g0.L(20.0f);
            boolean z10 = org.telegram.messenger.id.f23157a0;
            if (z10) {
                i13 = -1;
            } else {
                i13 = 1;
            }
            float f10 = width2 + (L * i13);
            if (z10) {
                s(!this.f46984o1, f10 - x10);
            } else {
                s(!this.f46984o1, f10 - width);
            }
            this.f46984o1 = false;
        }
    }

    public final void s(boolean z9, float f10) {
        ValueAnimator valueAnimator = this.n1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.n1 = null;
        }
        if (!z9) {
            setBubbleOffset(f10);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U0, f10);
        this.n1 = ofFloat;
        ofFloat.addUpdateListener(new a3(this, 5));
        this.n1.setInterpolator(org.telegram.ui.Components.xq.h);
        this.n1.setDuration(420L);
        this.n1.start();
    }
}
