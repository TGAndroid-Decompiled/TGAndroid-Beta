package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class pm extends AnimatorListenerAdapter {
    public final int f40940a;
    public final org.telegram.ui.ActionBar.y f40941b;
    public final qm f40942c;

    public pm(qm qmVar, org.telegram.ui.ActionBar.y yVar, int i10) {
        this.f40940a = i10;
        this.f40942c = qmVar;
        this.f40941b = yVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f40940a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.m2) this.f40942c.f41236c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                return;
            default:
                qm qmVar = this.f40942c;
                zn znVar = qmVar.f41236c;
                znVar.f44834i0.f(8);
                this.f40941b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.m2) znVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                qmVar.f41235b = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f40940a) {
            case 0:
                zn znVar = this.f40942c.f41236c;
                kVar = ((org.telegram.ui.ActionBar.m2) znVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                zn.S3(znVar);
                znVar.f44834i0.f(0);
                this.f40941b.r(AndroidUtilities.dp(48.0f));
                return;
            default:
                qm qmVar = this.f40942c;
                kVar2 = ((org.telegram.ui.ActionBar.m2) qmVar.f41236c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                qmVar.f41235b = true;
                return;
        }
    }
}
