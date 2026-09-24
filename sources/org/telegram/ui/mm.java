package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class mm extends AnimatorListenerAdapter {
    public final int f35608a;
    public final org.telegram.ui.ActionBar.y f35609b;
    public final nm f35610c;

    public mm(nm nmVar, org.telegram.ui.ActionBar.y yVar, int i10) {
        this.f35608a = i10;
        this.f35610c = nmVar;
        this.f35609b = yVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f35608a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.m2) this.f35610c.f35901c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                return;
            default:
                nm nmVar = this.f35610c;
                wn wnVar = nmVar.f35901c;
                wnVar.f39492i0.f(8);
                this.f35609b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                nmVar.f35900b = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f35608a) {
            case 0:
                wn wnVar = this.f35610c.f35901c;
                kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                wn.J3(wnVar);
                wnVar.f39492i0.f(0);
                this.f35609b.r(AndroidUtilities.dp(48.0f));
                return;
            default:
                nm nmVar = this.f35610c;
                kVar2 = ((org.telegram.ui.ActionBar.m2) nmVar.f35901c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                nmVar.f35900b = true;
                return;
        }
    }
}
