package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class hm extends AnimatorListenerAdapter {
    public final int f37900a;
    public final org.telegram.ui.ActionBar.y f37901b;
    public final im f37902c;

    public hm(im imVar, org.telegram.ui.ActionBar.y yVar, int i10) {
        this.f37900a = i10;
        this.f37902c = imVar;
        this.f37901b = yVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f37900a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.o2) this.f37902c.f38328c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                return;
            default:
                im imVar = this.f37902c;
                sn snVar = imVar.f38328c;
                snVar.f41545i0.f(8);
                this.f37901b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                imVar.f38327b = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f37900a) {
            case 0:
                sn snVar = this.f37902c.f38328c;
                kVar = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                sn.R3(snVar);
                snVar.f41545i0.f(0);
                this.f37901b.r(AndroidUtilities.dp(48.0f));
                return;
            default:
                im imVar = this.f37902c;
                kVar2 = ((org.telegram.ui.ActionBar.o2) imVar.f38328c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                imVar.f38327b = true;
                return;
        }
    }
}
