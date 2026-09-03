package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class om extends AnimatorListenerAdapter {
    public final int f36839a;
    public final org.telegram.ui.ActionBar.z f36840b;
    public final pm f36841c;

    public om(pm pmVar, org.telegram.ui.ActionBar.z zVar, int i10) {
        this.f36839a = i10;
        this.f36841c = pmVar;
        this.f36840b = zVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f36839a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.p2) this.f36841c.f37186c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                return;
            default:
                pm pmVar = this.f36841c;
                zn znVar = pmVar.f37186c;
                znVar.f40576f0.f(8);
                this.f36840b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                pmVar.f37185b = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f36839a) {
            case 0:
                zn znVar = this.f36841c.f37186c;
                kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                zn.J3(znVar);
                znVar.f40576f0.f(0);
                this.f36840b.r(AndroidUtilities.dp(48.0f));
                return;
            default:
                pm pmVar = this.f36841c;
                kVar2 = ((org.telegram.ui.ActionBar.p2) pmVar.f37186c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                pmVar.f37185b = true;
                return;
        }
    }
}
