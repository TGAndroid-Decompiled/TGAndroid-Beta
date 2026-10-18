package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class im extends AnimatorListenerAdapter {
    public final int f37914a;
    public final org.telegram.ui.ActionBar.y f37915b;
    public final jm f37916c;

    public im(jm jmVar, org.telegram.ui.ActionBar.y yVar, int i10) {
        this.f37914a = i10;
        this.f37916c = jmVar;
        this.f37915b = yVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f37914a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.n2) this.f37916c.f38230c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                return;
            default:
                jm jmVar = this.f37916c;
                sn snVar = jmVar.f38230c;
                snVar.f41230i0.f(8);
                this.f37915b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.n2) snVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                jmVar.f38229b = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f37914a) {
            case 0:
                sn snVar = this.f37916c.f38230c;
                kVar = ((org.telegram.ui.ActionBar.n2) snVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                sn.S3(snVar);
                snVar.f41230i0.f(0);
                this.f37915b.r(AndroidUtilities.dp(48.0f));
                return;
            default:
                jm jmVar = this.f37916c;
                kVar2 = ((org.telegram.ui.ActionBar.n2) jmVar.f38230c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                jmVar.f38229b = true;
                return;
        }
    }
}
