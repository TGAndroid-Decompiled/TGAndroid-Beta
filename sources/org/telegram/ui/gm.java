package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class gm extends AnimatorListenerAdapter {
    public final int f37353a;
    public final org.telegram.ui.ActionBar.y f37354b;
    public final hm f37355c;

    public gm(hm hmVar, org.telegram.ui.ActionBar.y yVar, int i10) {
        this.f37353a = i10;
        this.f37355c = hmVar;
        this.f37354b = yVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f37353a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.n2) this.f37355c.f37688c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                return;
            default:
                hm hmVar = this.f37355c;
                qn qnVar = hmVar.f37688c;
                qnVar.f40712i0.f(8);
                this.f37354b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                hmVar.f37687b = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f37353a) {
            case 0:
                qn qnVar = this.f37355c.f37688c;
                kVar = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                qn.S3(qnVar);
                qnVar.f40712i0.f(0);
                this.f37354b.r(AndroidUtilities.dp(48.0f));
                return;
            default:
                hm hmVar = this.f37355c;
                kVar2 = ((org.telegram.ui.ActionBar.n2) hmVar.f37688c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                hmVar.f37687b = true;
                return;
        }
    }
}
