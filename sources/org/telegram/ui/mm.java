package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class mm extends AnimatorListenerAdapter {
    public final int f35619a;
    public final org.telegram.ui.ActionBar.y f35620b;
    public final nm f35621c;

    public mm(nm nmVar, org.telegram.ui.ActionBar.y yVar, int i10) {
        this.f35619a = i10;
        this.f35621c = nmVar;
        this.f35620b = yVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f35619a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.m2) this.f35621c.f35923c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                return;
            default:
                nm nmVar = this.f35621c;
                wn wnVar = nmVar.f35923c;
                wnVar.f39506i0.f(8);
                this.f35620b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                nmVar.f35922b = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f35619a) {
            case 0:
                wn wnVar = this.f35621c.f35923c;
                kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                wn.J3(wnVar);
                wnVar.f39506i0.f(0);
                this.f35620b.r(AndroidUtilities.dp(48.0f));
                return;
            default:
                nm nmVar = this.f35621c;
                kVar2 = ((org.telegram.ui.ActionBar.m2) nmVar.f35923c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                nmVar.f35922b = true;
                return;
        }
    }
}
