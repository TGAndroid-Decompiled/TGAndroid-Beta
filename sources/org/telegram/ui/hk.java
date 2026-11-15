package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
public final class hk extends org.telegram.ui.Components.mi0 {
    public final int[] n1;
    public ValueAnimator f47731o1;
    public boolean f47732p1;
    public final an f47733q1;

    public hk(an anVar, an anVar2, Activity activity, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        super(3, i7, activity, anVar2, e6Var);
        this.f47733q1 = anVar;
        this.n1 = new int[2];
        this.f47732p1 = true;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        super.onLayout(z10, i7, i10, i11, i12);
        kVar = ((org.telegram.ui.ActionBar.e2) this.f47733q1).actionBar;
        org.telegram.ui.ActionBar.q0 j3 = kVar.p(null).j(28);
        if (j3 != null) {
            int[] iArr = this.n1;
            getLocationInWindow(iArr);
            float x10 = getX();
            float width = getWidth() + x10;
            j3.getLocationInWindow(iArr);
            float width2 = (j3.getWidth() / 2.0f) + iArr[0];
            int L = org.telegram.messenger.g0.L(20.0f);
            boolean z11 = org.telegram.messenger.hd.f24101a0;
            if (z11) {
                i13 = -1;
            } else {
                i13 = 1;
            }
            float f10 = width2 + (L * i13);
            if (z11) {
                s(!this.f47732p1, f10 - x10);
            } else {
                s(!this.f47732p1, f10 - width);
            }
            this.f47732p1 = false;
        }
    }

    public final void s(boolean z10, float f10) {
        ValueAnimator valueAnimator = this.f47731o1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f47731o1 = null;
        }
        if (!z10) {
            setBubbleOffset(f10);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V0, f10);
        this.f47731o1 = ofFloat;
        ofFloat.addUpdateListener(new a3(this, 5));
        this.f47731o1.setInterpolator(org.telegram.ui.Components.er.h);
        this.f47731o1.setDuration(420L);
        this.f47731o1.start();
    }
}
