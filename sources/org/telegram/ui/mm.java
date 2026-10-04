package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class mm extends AnimatorListenerAdapter {
    public final int f38673a;
    public final org.telegram.ui.ActionBar.z f38674b;
    public final nm f38675c;

    public mm(nm nmVar, org.telegram.ui.ActionBar.z zVar, int i10) {
        this.f38673a = i10;
        this.f38675c = nmVar;
        this.f38674b = zVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f38673a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.n2) this.f38675c.f39015c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                return;
            default:
                nm nmVar = this.f38675c;
                yn ynVar = nmVar.f39015c;
                ynVar.f43347g0.f(8);
                this.f38674b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                nmVar.f39014b = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f38673a) {
            case 0:
                yn ynVar = this.f38675c.f39015c;
                kVar = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                yn.J3(ynVar);
                ynVar.f43347g0.f(0);
                this.f38674b.r(AndroidUtilities.dp(48.0f));
                return;
            default:
                nm nmVar = this.f38675c;
                kVar2 = ((org.telegram.ui.ActionBar.n2) nmVar.f39015c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                nmVar.f39014b = true;
                return;
        }
    }
}
