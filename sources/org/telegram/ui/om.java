package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class om extends AnimatorListenerAdapter {
    public final int f36207a;
    public final org.telegram.ui.ActionBar.z f36208b;
    public final pm f36209c;

    public om(pm pmVar, org.telegram.ui.ActionBar.z zVar, int i10) {
        this.f36207a = i10;
        this.f36209c = pmVar;
        this.f36208b = zVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f36207a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.n2) this.f36209c.f36508c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                return;
            default:
                pm pmVar = this.f36209c;
                zn znVar = pmVar.f36508c;
                znVar.f40300i0.f(8);
                this.f36208b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                pmVar.f36507b = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f36207a) {
            case 0:
                zn znVar = this.f36209c.f36508c;
                kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                zn.J3(znVar);
                znVar.f40300i0.f(0);
                this.f36208b.r(AndroidUtilities.dp(48.0f));
                return;
            default:
                pm pmVar = this.f36209c;
                kVar2 = ((org.telegram.ui.ActionBar.n2) pmVar.f36508c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                pmVar.f36507b = true;
                return;
        }
    }
}
