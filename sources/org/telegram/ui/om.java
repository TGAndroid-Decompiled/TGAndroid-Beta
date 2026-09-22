package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class om extends AnimatorListenerAdapter {
    public final int f36362a;
    public final org.telegram.ui.ActionBar.z f36363b;
    public final pm f36364c;

    public om(pm pmVar, org.telegram.ui.ActionBar.z zVar, int i10) {
        this.f36362a = i10;
        this.f36364c = pmVar;
        this.f36363b = zVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f36362a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.n2) this.f36364c.f36611c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                return;
            default:
                pm pmVar = this.f36364c;
                zn znVar = pmVar.f36611c;
                znVar.f40363i0.f(8);
                this.f36363b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                pmVar.f36610b = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f36362a) {
            case 0:
                zn znVar = this.f36364c.f36611c;
                kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                zn.J3(znVar);
                znVar.f40363i0.f(0);
                this.f36363b.r(AndroidUtilities.dp(48.0f));
                return;
            default:
                pm pmVar = this.f36364c;
                kVar2 = ((org.telegram.ui.ActionBar.n2) pmVar.f36611c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                pmVar.f36610b = true;
                return;
        }
    }
}
