package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class pm extends AnimatorListenerAdapter {
    public final int f40872a;
    public final org.telegram.ui.ActionBar.z f40873b;
    public final qm f40874c;

    public pm(qm qmVar, org.telegram.ui.ActionBar.z zVar, int i10) {
        this.f40872a = i10;
        this.f40874c = qmVar;
        this.f40873b = zVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f40872a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.n2) this.f40874c.f41192c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                return;
            default:
                qm qmVar = this.f40874c;
                zn znVar = qmVar.f41192c;
                znVar.f44845i0.f(8);
                this.f40873b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                qmVar.f41191b = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f40872a) {
            case 0:
                zn znVar = this.f40874c.f41192c;
                kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                zn.S3(znVar);
                znVar.f44845i0.f(0);
                this.f40873b.r(AndroidUtilities.dp(48.0f));
                return;
            default:
                qm qmVar = this.f40874c;
                kVar2 = ((org.telegram.ui.ActionBar.n2) qmVar.f41192c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                qmVar.f41191b = true;
                return;
        }
    }
}
