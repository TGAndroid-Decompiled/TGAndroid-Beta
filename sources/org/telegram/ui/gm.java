package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class gm extends AnimatorListenerAdapter {
    public final int f37356a;
    public final org.telegram.ui.ActionBar.y f37357b;
    public final hm f37358c;

    public gm(hm hmVar, org.telegram.ui.ActionBar.y yVar, int i10) {
        this.f37356a = i10;
        this.f37358c = hmVar;
        this.f37357b = yVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f37356a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.n2) this.f37358c.f37691c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                return;
            default:
                hm hmVar = this.f37358c;
                qn qnVar = hmVar.f37691c;
                qnVar.f40715i0.f(8);
                this.f37357b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                hmVar.f37690b = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f37356a) {
            case 0:
                qn qnVar = this.f37358c.f37691c;
                kVar = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                qn.S3(qnVar);
                qnVar.f40715i0.f(0);
                this.f37357b.r(AndroidUtilities.dp(48.0f));
                return;
            default:
                hm hmVar = this.f37358c;
                kVar2 = ((org.telegram.ui.ActionBar.n2) hmVar.f37691c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                hmVar.f37690b = true;
                return;
        }
    }
}
