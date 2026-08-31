package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class mm extends AnimatorListenerAdapter {
    public final int f39173a;
    public final org.telegram.ui.ActionBar.z f39174b;
    public final nm f39175c;

    public mm(nm nmVar, org.telegram.ui.ActionBar.z zVar, int i10) {
        this.f39173a = i10;
        this.f39175c = nmVar;
        this.f39174b = zVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f39173a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.p2) this.f39175c.f39482c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                return;
            default:
                nm nmVar = this.f39175c;
                xn xnVar = nmVar.f39482c;
                xnVar.f43179f0.f(8);
                this.f39174b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                nmVar.f39481b = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f39173a) {
            case 0:
                xn xnVar = this.f39175c.f39482c;
                kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                xn.J3(xnVar);
                xnVar.f43179f0.f(0);
                this.f39174b.r(AndroidUtilities.dp(48.0f));
                return;
            default:
                nm nmVar = this.f39175c;
                kVar2 = ((org.telegram.ui.ActionBar.p2) nmVar.f39482c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                nmVar.f39481b = true;
                return;
        }
    }
}
