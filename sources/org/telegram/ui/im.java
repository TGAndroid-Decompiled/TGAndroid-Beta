package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class im extends AnimatorListenerAdapter {
    public final int f37932a;
    public final org.telegram.ui.ActionBar.y f37933b;
    public final jm f37934c;

    public im(jm jmVar, org.telegram.ui.ActionBar.y yVar, int i10) {
        this.f37932a = i10;
        this.f37934c = jmVar;
        this.f37933b = yVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f37932a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.n2) this.f37934c.f38245c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                return;
            default:
                jm jmVar = this.f37934c;
                sn snVar = jmVar.f38245c;
                snVar.f41265i0.f(8);
                this.f37933b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.n2) snVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                jmVar.f38244b = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f37932a) {
            case 0:
                sn snVar = this.f37934c.f38245c;
                kVar = ((org.telegram.ui.ActionBar.n2) snVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                sn.S3(snVar);
                snVar.f41265i0.f(0);
                this.f37933b.r(AndroidUtilities.dp(48.0f));
                return;
            default:
                jm jmVar = this.f37934c;
                kVar2 = ((org.telegram.ui.ActionBar.n2) jmVar.f38245c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                jmVar.f38244b = true;
                return;
        }
    }
}
