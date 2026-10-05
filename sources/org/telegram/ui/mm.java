package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class mm extends AnimatorListenerAdapter {
    public final int f38659a;
    public final org.telegram.ui.ActionBar.z f38660b;
    public final nm f38661c;

    public mm(nm nmVar, org.telegram.ui.ActionBar.z zVar, int i10) {
        this.f38659a = i10;
        this.f38661c = nmVar;
        this.f38660b = zVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f38659a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.n2) this.f38661c.f39004c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                return;
            default:
                nm nmVar = this.f38661c;
                yn ynVar = nmVar.f39004c;
                ynVar.f43340g0.f(8);
                this.f38660b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                nmVar.f39003b = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f38659a) {
            case 0:
                yn ynVar = this.f38661c.f39004c;
                kVar = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                yn.J3(ynVar);
                ynVar.f43340g0.f(0);
                this.f38660b.r(AndroidUtilities.dp(48.0f));
                return;
            default:
                nm nmVar = this.f38661c;
                kVar2 = ((org.telegram.ui.ActionBar.n2) nmVar.f39004c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                nmVar.f39003b = true;
                return;
        }
    }
}
