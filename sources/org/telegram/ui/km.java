package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class km extends AnimatorListenerAdapter {
    public final int f40826a;
    public final org.telegram.ui.ActionBar.z f40827b;
    public final lm f40828c;

    public km(lm lmVar, org.telegram.ui.ActionBar.z zVar, int i10) {
        this.f40826a = i10;
        this.f40828c = lmVar;
        this.f40827b = zVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f40826a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.r2) this.f40828c.f41203c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                return;
            default:
                lm lmVar = this.f40828c;
                wn wnVar = lmVar.f41203c;
                wnVar.f45150i0.f(8);
                this.f40827b.q(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                lmVar.f41202b = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f40826a) {
            case 0:
                wn wnVar = this.f40828c.f41203c;
                kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                wn.U3(wnVar);
                wnVar.f45150i0.f(0);
                this.f40827b.q(AndroidUtilities.dp(48.0f));
                return;
            default:
                lm lmVar = this.f40828c;
                kVar2 = ((org.telegram.ui.ActionBar.r2) lmVar.f41203c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                lmVar.f41202b = true;
                return;
        }
    }
}
