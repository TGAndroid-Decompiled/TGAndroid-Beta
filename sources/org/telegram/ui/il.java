package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class il extends org.telegram.ui.Components.gl0 {
    public final int[] l1;
    public ValueAnimator f37164m1;
    public boolean f37165n1;
    public final fo f37166o1;

    public il(fo foVar, fo foVar2, Activity activity, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(3, i10, activity, foVar2, c6Var);
        this.f37166o1 = foVar;
        this.l1 = new int[2];
        this.f37165n1 = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.k kVar;
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        kVar = ((org.telegram.ui.ActionBar.m2) this.f37166o1).actionBar;
        org.telegram.ui.ActionBar.u0 k10 = kVar.j(null).k(28);
        if (k10 != null) {
            int[] iArr = this.l1;
            getLocationInWindow(iArr);
            float x10 = getX();
            float width = getWidth() + x10;
            k10.getLocationInWindow(iArr);
            float width2 = (k10.getWidth() / 2.0f) + iArr[0];
            int dp = AndroidUtilities.dp(20.0f);
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i14 = -1;
            } else {
                i14 = 1;
            }
            float f7 = width2 + (dp * i14);
            if (z11) {
                s(f7 - x10, !this.f37165n1);
            } else {
                s(f7 - width, !this.f37165n1);
            }
            this.f37165n1 = false;
        }
    }

    public final void s(float f7, boolean z10) {
        ValueAnimator valueAnimator = this.f37164m1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f37164m1 = null;
        }
        if (!z10) {
            setBubbleOffset(f7);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U0, f7);
        this.f37164m1 = ofFloat;
        ofFloat.addUpdateListener(new e3(this, 6));
        this.f37164m1.setInterpolator(org.telegram.ui.Components.es.h);
        this.f37164m1.setDuration(420L);
        this.f37164m1.start();
    }
}
