package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
public final class dl extends org.telegram.ui.Components.mj0 {
    public final int[] f36792m1;
    public ValueAnimator f36793n1;
    public boolean f36794o1;
    public final un f36795p1;

    public dl(un unVar, un unVar2, Activity activity, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(3, i10, activity, unVar2, p6Var);
        this.f36795p1 = unVar;
        this.f36792m1 = new int[2];
        this.f36794o1 = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.l lVar;
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        lVar = ((org.telegram.ui.ActionBar.k2) this.f36795p1).actionBar;
        org.telegram.ui.ActionBar.t0 j10 = lVar.m(null).j(28);
        if (j10 != null) {
            int[] iArr = this.f36792m1;
            getLocationInWindow(iArr);
            float x10 = getX();
            float width = getWidth() + x10;
            j10.getLocationInWindow(iArr);
            float width2 = (j10.getWidth() / 2.0f) + iArr[0];
            int L = org.telegram.messenger.i0.L(20.0f);
            boolean z11 = org.telegram.messenger.cd.X;
            if (z11) {
                i14 = -1;
            } else {
                i14 = 1;
            }
            float f7 = width2 + (L * i14);
            if (z11) {
                s(!this.f36794o1, f7 - x10);
            } else {
                s(!this.f36794o1, f7 - width);
            }
            this.f36794o1 = false;
        }
    }

    public final void s(boolean z10, float f7) {
        ValueAnimator valueAnimator = this.f36793n1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f36793n1 = null;
        }
        if (!z10) {
            setBubbleOffset(f7);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U0, f7);
        this.f36793n1 = ofFloat;
        ofFloat.addUpdateListener(new a3(this, 5));
        this.f36793n1.setInterpolator(org.telegram.ui.Components.gr.h);
        this.f36793n1.setDuration(420L);
        this.f36793n1.start();
    }
}
