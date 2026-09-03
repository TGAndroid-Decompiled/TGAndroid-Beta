package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class mm extends AnimatorListenerAdapter {
    public final int f38998a;
    public final org.telegram.ui.ActionBar.z f38999b;
    public final nm f39000c;

    public mm(nm nmVar, org.telegram.ui.ActionBar.z zVar, int i10) {
        this.f38998a = i10;
        this.f39000c = nmVar;
        this.f38999b = zVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f38998a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.p2) this.f39000c.f39403c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                return;
            default:
                nm nmVar = this.f39000c;
                xn xnVar = nmVar.f39403c;
                xnVar.f43157f0.f(8);
                this.f38999b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                nmVar.f39402b = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f38998a) {
            case 0:
                xn xnVar = this.f39000c.f39403c;
                kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                xn.J3(xnVar);
                xnVar.f43157f0.f(0);
                this.f38999b.r(AndroidUtilities.dp(48.0f));
                return;
            default:
                nm nmVar = this.f39000c;
                kVar2 = ((org.telegram.ui.ActionBar.p2) nmVar.f39403c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                nmVar.f39402b = true;
                return;
        }
    }
}
