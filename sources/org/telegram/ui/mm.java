package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class mm extends AnimatorListenerAdapter {
    public final int f35709a;
    public final org.telegram.ui.ActionBar.y f35710b;
    public final nm f35711c;

    public mm(nm nmVar, org.telegram.ui.ActionBar.y yVar, int i10) {
        this.f35709a = i10;
        this.f35711c = nmVar;
        this.f35710b = yVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f35709a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.m2) this.f35711c.f36040c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                return;
            default:
                nm nmVar = this.f35711c;
                wn wnVar = nmVar.f36040c;
                wnVar.f39600i0.f(8);
                this.f35710b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                nmVar.f36039b = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f35709a) {
            case 0:
                wn wnVar = this.f35711c.f36040c;
                kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                wn.J3(wnVar);
                wnVar.f39600i0.f(0);
                this.f35710b.r(AndroidUtilities.dp(48.0f));
                return;
            default:
                nm nmVar = this.f35711c;
                kVar2 = ((org.telegram.ui.ActionBar.m2) nmVar.f36040c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                nmVar.f36039b = true;
                return;
        }
    }
}
