package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class om extends AnimatorListenerAdapter {
    public final int f36335a;
    public final org.telegram.ui.ActionBar.z f36336b;
    public final pm f36337c;

    public om(pm pmVar, org.telegram.ui.ActionBar.z zVar, int i10) {
        this.f36335a = i10;
        this.f36337c = pmVar;
        this.f36336b = zVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f36335a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.n2) this.f36337c.f36588c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                return;
            default:
                pm pmVar = this.f36337c;
                zn znVar = pmVar.f36588c;
                znVar.f40342i0.f(8);
                this.f36336b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                pmVar.f36587b = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f36335a) {
            case 0:
                zn znVar = this.f36337c.f36588c;
                kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                zn.J3(znVar);
                znVar.f40342i0.f(0);
                this.f36336b.r(AndroidUtilities.dp(48.0f));
                return;
            default:
                pm pmVar = this.f36337c;
                kVar2 = ((org.telegram.ui.ActionBar.n2) pmVar.f36588c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                pmVar.f36587b = true;
                return;
        }
    }
}
