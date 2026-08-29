package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class hm extends AnimatorListenerAdapter {
    public final int f38958a;
    public final org.telegram.ui.ActionBar.a0 f38959b;
    public final im f38960c;

    public hm(im imVar, org.telegram.ui.ActionBar.a0 a0Var, int i10) {
        this.f38958a = i10;
        this.f38960c = imVar;
        this.f38959b = a0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        switch (this.f38958a) {
            case 0:
                lVar = ((org.telegram.ui.ActionBar.o2) this.f38960c.f39293c).actionBar;
                lVar.setMenuOffsetSuppressed(false);
                return;
            default:
                im imVar = this.f38960c;
                tn tnVar = imVar.f39293c;
                tnVar.f42788e0.f(8);
                this.f38959b.r(0.0f);
                lVar2 = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                lVar2.setMenuOffsetSuppressed(false);
                imVar.f39292b = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        switch (this.f38958a) {
            case 0:
                tn tnVar = this.f38960c.f39293c;
                lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                lVar.setMenuOffsetSuppressed(true);
                tn.J3(tnVar);
                tnVar.f42788e0.f(0);
                this.f38959b.r(AndroidUtilities.dp(48.0f));
                return;
            default:
                im imVar = this.f38960c;
                lVar2 = ((org.telegram.ui.ActionBar.o2) imVar.f39293c).actionBar;
                lVar2.setMenuOffsetSuppressed(true);
                imVar.f39292b = true;
                return;
        }
    }
}
