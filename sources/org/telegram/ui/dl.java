package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class dl extends org.telegram.ui.Components.fk0 {
    public final int[] l1;
    public ValueAnimator f35812m1;
    public boolean f35813n1;
    public final co f35814o1;

    public dl(co coVar, co coVar2, Activity activity, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(3, i10, activity, coVar2, f6Var);
        this.f35814o1 = coVar;
        this.l1 = new int[2];
        this.f35813n1 = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.k kVar;
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        kVar = ((org.telegram.ui.ActionBar.n2) this.f35814o1).actionBar;
        org.telegram.ui.ActionBar.v0 k10 = kVar.j(null).k(28);
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
                s(f7 - x10, !this.f35813n1);
            } else {
                s(f7 - width, !this.f35813n1);
            }
            this.f35813n1 = false;
        }
    }

    public final void s(float f7, boolean z10) {
        ValueAnimator valueAnimator = this.f35812m1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f35812m1 = null;
        }
        if (!z10) {
            setBubbleOffset(f7);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U0, f7);
        this.f35812m1 = ofFloat;
        ofFloat.addUpdateListener(new c3(this, 6));
        this.f35812m1.setInterpolator(org.telegram.ui.Components.pr.h);
        this.f35812m1.setDuration(420L);
        this.f35812m1.start();
    }
}
