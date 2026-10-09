package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class pm extends AnimatorListenerAdapter {
    public final int f40826a;
    public final org.telegram.ui.ActionBar.z f40827b;
    public final qm f40828c;

    public pm(qm qmVar, org.telegram.ui.ActionBar.z zVar, int i10) {
        this.f40826a = i10;
        this.f40828c = qmVar;
        this.f40827b = zVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f40826a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.n2) this.f40828c.f41146c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                return;
            default:
                qm qmVar = this.f40828c;
                zn znVar = qmVar.f41146c;
                znVar.f44799i0.f(8);
                this.f40827b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                qmVar.f41145b = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f40826a) {
            case 0:
                zn znVar = this.f40828c.f41146c;
                kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                zn.S3(znVar);
                znVar.f44799i0.f(0);
                this.f40827b.r(AndroidUtilities.dp(48.0f));
                return;
            default:
                qm qmVar = this.f40828c;
                kVar2 = ((org.telegram.ui.ActionBar.n2) qmVar.f41146c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                qmVar.f41145b = true;
                return;
        }
    }
}
