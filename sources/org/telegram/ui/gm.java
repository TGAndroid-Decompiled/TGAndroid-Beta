package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class gm extends AnimatorListenerAdapter {
    public final int f37346a;
    public final org.telegram.ui.ActionBar.y f37347b;
    public final hm f37348c;

    public gm(hm hmVar, org.telegram.ui.ActionBar.y yVar, int i10) {
        this.f37346a = i10;
        this.f37348c = hmVar;
        this.f37347b = yVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f37346a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.n2) this.f37348c.f37681c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                return;
            default:
                hm hmVar = this.f37348c;
                qn qnVar = hmVar.f37681c;
                qnVar.f40706i0.f(8);
                this.f37347b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                hmVar.f37680b = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f37346a) {
            case 0:
                qn qnVar = this.f37348c.f37681c;
                kVar = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                qn.S3(qnVar);
                qnVar.f40706i0.f(0);
                this.f37347b.r(AndroidUtilities.dp(48.0f));
                return;
            default:
                hm hmVar = this.f37348c;
                kVar2 = ((org.telegram.ui.ActionBar.n2) hmVar.f37681c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                hmVar.f37680b = true;
                return;
        }
    }
}
