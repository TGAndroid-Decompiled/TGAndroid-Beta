package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class em extends AnimatorListenerAdapter {
    public final int f37988a;
    public final org.telegram.ui.ActionBar.z f37989b;
    public final gm f37990c;

    public em(gm gmVar, org.telegram.ui.ActionBar.z zVar, int i9) {
        this.f37988a = i9;
        this.f37990c = gmVar;
        this.f37989b = zVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f37988a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.o2) this.f37990c.f38568c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                return;
            default:
                gm gmVar = this.f37990c;
                qn qnVar = gmVar.f38568c;
                qnVar.f41891e0.f(8);
                this.f37989b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                gmVar.f38567b = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f37988a) {
            case 0:
                qn qnVar = this.f37990c.f38568c;
                kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                qn.J3(qnVar);
                qnVar.f41891e0.f(0);
                this.f37989b.r(AndroidUtilities.dp(48.0f));
                return;
            default:
                gm gmVar = this.f37990c;
                kVar2 = ((org.telegram.ui.ActionBar.o2) gmVar.f38568c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                gmVar.f38567b = true;
                return;
        }
    }
}
