package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class mm extends AnimatorListenerAdapter {
    public final int f35621a;
    public final org.telegram.ui.ActionBar.y f35622b;
    public final nm f35623c;

    public mm(nm nmVar, org.telegram.ui.ActionBar.y yVar, int i10) {
        this.f35621a = i10;
        this.f35623c = nmVar;
        this.f35622b = yVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f35621a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.m2) this.f35623c.f35925c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                return;
            default:
                nm nmVar = this.f35623c;
                wn wnVar = nmVar.f35925c;
                wnVar.f39508i0.f(8);
                this.f35622b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                nmVar.f35924b = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f35621a) {
            case 0:
                wn wnVar = this.f35623c.f35925c;
                kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                wn.J3(wnVar);
                wnVar.f39508i0.f(0);
                this.f35622b.r(AndroidUtilities.dp(48.0f));
                return;
            default:
                nm nmVar = this.f35623c;
                kVar2 = ((org.telegram.ui.ActionBar.m2) nmVar.f35925c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                nmVar.f35924b = true;
                return;
        }
    }
}
