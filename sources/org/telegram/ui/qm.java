package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class qm extends AnimatorListenerAdapter {
    public final int f36901a;
    public final org.telegram.ui.ActionBar.z f36902b;
    public final rm f36903c;

    public qm(rm rmVar, org.telegram.ui.ActionBar.z zVar, int i10) {
        this.f36901a = i10;
        this.f36903c = rmVar;
        this.f36902b = zVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f36901a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.n2) this.f36903c.f37167c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                return;
            default:
                rm rmVar = this.f36903c;
                bo boVar = rmVar.f37167c;
                boVar.f32331i0.f(8);
                this.f36902b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                rmVar.f37166b = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f36901a) {
            case 0:
                bo boVar = this.f36903c.f37167c;
                kVar = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                bo.J3(boVar);
                boVar.f32331i0.f(0);
                this.f36902b.r(AndroidUtilities.dp(48.0f));
                return;
            default:
                rm rmVar = this.f36903c;
                kVar2 = ((org.telegram.ui.ActionBar.n2) rmVar.f37167c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                rmVar.f37166b = true;
                return;
        }
    }
}
