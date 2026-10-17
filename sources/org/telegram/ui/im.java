package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class im extends AnimatorListenerAdapter {
    public final int f37918a;
    public final org.telegram.ui.ActionBar.y f37919b;
    public final jm f37920c;

    public im(jm jmVar, org.telegram.ui.ActionBar.y yVar, int i10) {
        this.f37918a = i10;
        this.f37920c = jmVar;
        this.f37919b = yVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f37918a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.n2) this.f37920c.f38229c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                return;
            default:
                jm jmVar = this.f37920c;
                sn snVar = jmVar.f38229c;
                snVar.f41244i0.f(8);
                this.f37919b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.n2) snVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                jmVar.f38228b = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f37918a) {
            case 0:
                sn snVar = this.f37920c.f38229c;
                kVar = ((org.telegram.ui.ActionBar.n2) snVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                sn.S3(snVar);
                snVar.f41244i0.f(0);
                this.f37919b.r(AndroidUtilities.dp(48.0f));
                return;
            default:
                jm jmVar = this.f37920c;
                kVar2 = ((org.telegram.ui.ActionBar.n2) jmVar.f38229c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                jmVar.f38228b = true;
                return;
        }
    }
}
