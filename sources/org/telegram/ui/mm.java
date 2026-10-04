package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class mm extends AnimatorListenerAdapter {
    public final int f38667a;
    public final org.telegram.ui.ActionBar.z f38668b;
    public final nm f38669c;

    public mm(nm nmVar, org.telegram.ui.ActionBar.z zVar, int i10) {
        this.f38667a = i10;
        this.f38669c = nmVar;
        this.f38668b = zVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f38667a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.n2) this.f38669c.f39009c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                return;
            default:
                nm nmVar = this.f38669c;
                yn ynVar = nmVar.f39009c;
                ynVar.f43339g0.f(8);
                this.f38668b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                nmVar.f39008b = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f38667a) {
            case 0:
                yn ynVar = this.f38669c.f39009c;
                kVar = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                yn.J3(ynVar);
                ynVar.f43339g0.f(0);
                this.f38668b.r(AndroidUtilities.dp(48.0f));
                return;
            default:
                nm nmVar = this.f38669c;
                kVar2 = ((org.telegram.ui.ActionBar.n2) nmVar.f39009c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                nmVar.f39008b = true;
                return;
        }
    }
}
