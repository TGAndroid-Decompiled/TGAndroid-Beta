package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class nm extends AnimatorListenerAdapter {
    public final int f36045a;
    public final org.telegram.ui.ActionBar.a0 f36046b;
    public final om f36047c;

    public nm(om omVar, org.telegram.ui.ActionBar.a0 a0Var, int i10) {
        this.f36045a = i10;
        this.f36047c = omVar;
        this.f36046b = a0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        switch (this.f36045a) {
            case 0:
                lVar = ((org.telegram.ui.ActionBar.o2) this.f36047c.f36226c).actionBar;
                lVar.setMenuOffsetSuppressed(false);
                return;
            default:
                om omVar = this.f36047c;
                xn xnVar = omVar.f36226c;
                xnVar.f39789i0.f(8);
                this.f36046b.r(0.0f);
                lVar2 = ((org.telegram.ui.ActionBar.o2) xnVar).actionBar;
                lVar2.setMenuOffsetSuppressed(false);
                omVar.f36225b = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        switch (this.f36045a) {
            case 0:
                xn xnVar = this.f36047c.f36226c;
                lVar = ((org.telegram.ui.ActionBar.o2) xnVar).actionBar;
                lVar.setMenuOffsetSuppressed(true);
                xn.J3(xnVar);
                xnVar.f39789i0.f(0);
                this.f36046b.r(AndroidUtilities.dp(48.0f));
                return;
            default:
                om omVar = this.f36047c;
                lVar2 = ((org.telegram.ui.ActionBar.o2) omVar.f36226c).actionBar;
                lVar2.setMenuOffsetSuppressed(true);
                omVar.f36225b = true;
                return;
        }
    }
}
