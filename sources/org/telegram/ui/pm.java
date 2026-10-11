package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class pm extends AnimatorListenerAdapter {
    public final int f40906a;
    public final org.telegram.ui.ActionBar.y f40907b;
    public final qm f40908c;

    public pm(qm qmVar, org.telegram.ui.ActionBar.y yVar, int i10) {
        this.f40906a = i10;
        this.f40908c = qmVar;
        this.f40907b = yVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f40906a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.m2) this.f40908c.f41202c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                return;
            default:
                qm qmVar = this.f40908c;
                zn znVar = qmVar.f41202c;
                znVar.f44800i0.f(8);
                this.f40907b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.m2) znVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                qmVar.f41201b = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f40906a) {
            case 0:
                zn znVar = this.f40908c.f41202c;
                kVar = ((org.telegram.ui.ActionBar.m2) znVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                zn.S3(znVar);
                znVar.f44800i0.f(0);
                this.f40907b.r(AndroidUtilities.dp(48.0f));
                return;
            default:
                qm qmVar = this.f40908c;
                kVar2 = ((org.telegram.ui.ActionBar.m2) qmVar.f41202c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                qmVar.f41201b = true;
                return;
        }
    }
}
