package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class mm extends AnimatorListenerAdapter {
    public final int f36347a;
    public final org.telegram.ui.ActionBar.z f36348b;
    public final nm f36349c;

    public mm(nm nmVar, org.telegram.ui.ActionBar.z zVar, int i10) {
        this.f36347a = i10;
        this.f36349c = nmVar;
        this.f36348b = zVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f36347a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.p2) this.f36349c.f36688c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                return;
            default:
                nm nmVar = this.f36349c;
                xn xnVar = nmVar.f36688c;
                xnVar.f40010f0.f(8);
                this.f36348b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                nmVar.f36687b = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f36347a) {
            case 0:
                xn xnVar = this.f36349c.f36688c;
                kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                xn.J3(xnVar);
                xnVar.f40010f0.f(0);
                this.f36348b.r(AndroidUtilities.dp(48.0f));
                return;
            default:
                nm nmVar = this.f36349c;
                kVar2 = ((org.telegram.ui.ActionBar.p2) nmVar.f36688c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                nmVar.f36687b = true;
                return;
        }
    }
}
