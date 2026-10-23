package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class hm extends AnimatorListenerAdapter {
    public final int f37876a;
    public final org.telegram.ui.ActionBar.y f37877b;
    public final im f37878c;

    public hm(im imVar, org.telegram.ui.ActionBar.y yVar, int i10) {
        this.f37876a = i10;
        this.f37878c = imVar;
        this.f37877b = yVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f37876a) {
            case 0:
                kVar = ((org.telegram.ui.ActionBar.o2) this.f37878c.f38268c).actionBar;
                kVar.setMenuOffsetSuppressed(false);
                return;
            default:
                im imVar = this.f37878c;
                sn snVar = imVar.f38268c;
                snVar.f41548i0.f(8);
                this.f37877b.r(0.0f);
                kVar2 = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
                kVar2.setMenuOffsetSuppressed(false);
                imVar.f38267b = false;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f37876a) {
            case 0:
                sn snVar = this.f37878c.f38268c;
                kVar = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
                kVar.setMenuOffsetSuppressed(true);
                sn.R3(snVar);
                snVar.f41548i0.f(0);
                this.f37877b.r(AndroidUtilities.dp(48.0f));
                return;
            default:
                im imVar = this.f37878c;
                kVar2 = ((org.telegram.ui.ActionBar.o2) imVar.f38268c).actionBar;
                kVar2.setMenuOffsetSuppressed(true);
                imVar.f38267b = true;
                return;
        }
    }
}
