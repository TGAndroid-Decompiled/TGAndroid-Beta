package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class nm extends AnimatorListenerAdapter {
    public final int f35553a;
    public final org.telegram.ui.ActionBar.z f35554b;
    public final om f35555c;

    public nm(om omVar, org.telegram.ui.ActionBar.z zVar, int i10) {
        this.f35553a = i10;
        this.f35555c = omVar;
        this.f35554b = zVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f35553a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.n2) this.f35555c.f35909c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                return;
            default:
                om omVar = this.f35555c;
                xn xnVar = omVar.f35909c;
                xnVar.f39408i0.f(8);
                this.f35554b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.n2) xnVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                omVar.f35908b = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f35553a) {
            case 0:
                xn xnVar = this.f35555c.f35909c;
                kVar = ((org.telegram.ui.ActionBar.n2) xnVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                xn.J3(xnVar);
                xnVar.f39408i0.f(0);
                this.f35554b.r(AndroidUtilities.dp(48.0f));
                return;
            default:
                om omVar = this.f35555c;
                kVar2 = ((org.telegram.ui.ActionBar.n2) omVar.f35909c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                omVar.f35908b = true;
                return;
        }
    }
}
