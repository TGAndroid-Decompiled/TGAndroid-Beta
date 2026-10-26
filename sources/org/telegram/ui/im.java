package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class im extends AnimatorListenerAdapter {
    public final int f40263a;
    public final org.telegram.ui.ActionBar.z f40264b;
    public final jm f40265c;

    public im(jm jmVar, org.telegram.ui.ActionBar.z zVar, int i10) {
        this.f40263a = i10;
        this.f40265c = jmVar;
        this.f40264b = zVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f40263a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.r2) this.f40265c.f40688c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                return;
            default:
                jm jmVar = this.f40265c;
                un unVar = jmVar.f40688c;
                unVar.f44282i0.f(8);
                this.f40264b.q(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                jmVar.f40687b = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f40263a) {
            case 0:
                un unVar = this.f40265c.f40688c;
                kVar = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                un.T3(unVar);
                unVar.f44282i0.f(0);
                this.f40264b.q(AndroidUtilities.dp(48.0f));
                return;
            default:
                jm jmVar = this.f40265c;
                kVar2 = ((org.telegram.ui.ActionBar.r2) jmVar.f40688c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                jmVar.f40687b = true;
                return;
        }
    }
}
