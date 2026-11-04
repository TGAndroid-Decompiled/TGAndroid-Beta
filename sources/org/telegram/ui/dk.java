package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
public final class dk extends org.telegram.ui.Components.li0 {
    public final int[] f44725n1;
    public ValueAnimator f44726o1;
    public boolean f44727p1;
    public final wm f44728q1;

    public dk(wm wmVar, wm wmVar2, Activity activity, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(3, i3, activity, wmVar2, e6Var);
        this.f44728q1 = wmVar;
        this.f44725n1 = new int[2];
        this.f44727p1 = true;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        super.onLayout(z10, i3, i10, i11, i12);
        kVar = ((org.telegram.ui.ActionBar.d2) this.f44728q1).actionBar;
        org.telegram.ui.ActionBar.q0 j10 = kVar.n(null).j(28);
        if (j10 != null) {
            int[] iArr = this.f44725n1;
            getLocationInWindow(iArr);
            float x10 = getX();
            float width = getWidth() + x10;
            j10.getLocationInWindow(iArr);
            float width2 = (j10.getWidth() / 2.0f) + iArr[0];
            int L = org.telegram.messenger.g0.L(20.0f);
            boolean z11 = org.telegram.messenger.bd.f21784a0;
            if (z11) {
                i13 = -1;
            } else {
                i13 = 1;
            }
            float f10 = width2 + (L * i13);
            if (z11) {
                s(!this.f44727p1, f10 - x10);
            } else {
                s(!this.f44727p1, f10 - width);
            }
            this.f44727p1 = false;
        }
    }

    public final void s(boolean z10, float f10) {
        ValueAnimator valueAnimator = this.f44726o1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f44726o1 = null;
        }
        if (!z10) {
            setBubbleOffset(f10);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V0, f10);
        this.f44726o1 = ofFloat;
        ofFloat.addUpdateListener(new b3(this, 5));
        this.f44726o1.setInterpolator(org.telegram.ui.Components.xq.h);
        this.f44726o1.setDuration(420L);
        this.f44726o1.start();
    }
}
