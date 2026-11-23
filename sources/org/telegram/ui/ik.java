package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
public final class ik extends org.telegram.ui.Components.xi0 {
    public final int[] n1;
    public ValueAnimator f48836o1;
    public boolean f48837p1;
    public final bn f48838q1;

    public ik(bn bnVar, bn bnVar2, Activity activity, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(3, i7, activity, bnVar2, i6Var);
        this.f48838q1 = bnVar;
        this.n1 = new int[2];
        this.f48837p1 = true;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        super.onLayout(z10, i7, i10, i11, i12);
        kVar = ((org.telegram.ui.ActionBar.g2) this.f48838q1).actionBar;
        org.telegram.ui.ActionBar.q0 j3 = kVar.p(null).j(28);
        if (j3 != null) {
            int[] iArr = this.n1;
            getLocationInWindow(iArr);
            float x10 = getX();
            float width = getWidth() + x10;
            j3.getLocationInWindow(iArr);
            float width2 = (j3.getWidth() / 2.0f) + iArr[0];
            int L = org.telegram.messenger.g0.L(20.0f);
            boolean z11 = org.telegram.messenger.gd.f24314a0;
            if (z11) {
                i13 = -1;
            } else {
                i13 = 1;
            }
            float f10 = width2 + (L * i13);
            if (z11) {
                s(!this.f48837p1, f10 - x10);
            } else {
                s(!this.f48837p1, f10 - width);
            }
            this.f48837p1 = false;
        }
    }

    public final void s(boolean z10, float f10) {
        ValueAnimator valueAnimator = this.f48836o1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f48836o1 = null;
        }
        if (!z10) {
            setBubbleOffset(f10);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V0, f10);
        this.f48836o1 = ofFloat;
        ofFloat.addUpdateListener(new a3(this, 5));
        this.f48836o1.setInterpolator(org.telegram.ui.Components.kr.h);
        this.f48836o1.setDuration(420L);
        this.f48836o1.start();
    }
}
