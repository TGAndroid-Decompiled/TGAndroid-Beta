package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class im extends AnimatorListenerAdapter {
    public final int f40260a;
    public final org.telegram.ui.ActionBar.z f40261b;
    public final jm f40262c;

    public im(jm jmVar, org.telegram.ui.ActionBar.z zVar, int i10) {
        this.f40260a = i10;
        this.f40262c = jmVar;
        this.f40261b = zVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f40260a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.r2) this.f40262c.f40685c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                return;
            default:
                jm jmVar = this.f40262c;
                un unVar = jmVar.f40685c;
                unVar.f44279i0.f(8);
                this.f40261b.q(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                jmVar.f40684b = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f40260a) {
            case 0:
                un unVar = this.f40262c.f40685c;
                kVar = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                un.T3(unVar);
                unVar.f44279i0.f(0);
                this.f40261b.q(AndroidUtilities.dp(48.0f));
                return;
            default:
                jm jmVar = this.f40262c;
                kVar2 = ((org.telegram.ui.ActionBar.r2) jmVar.f40685c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                jmVar.f40684b = true;
                return;
        }
    }
}
