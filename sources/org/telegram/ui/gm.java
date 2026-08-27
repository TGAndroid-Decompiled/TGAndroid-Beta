package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

public final class gm extends AnimatorListenerAdapter {

    public final int f38443a;

    public final org.telegram.ui.ActionBar.z f38444b;

    public final hm f38445c;

    public gm(hm hmVar, org.telegram.ui.ActionBar.z zVar, int i10) {
        this.f38443a = i10;
        this.f38445c = hmVar;
        this.f38444b = zVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38443a) {
            case 0:
                ((org.telegram.ui.ActionBar.n2) this.f38445c.f38857c).actionBar.setMenuOffsetSuppressed(false);
                break;
            default:
                hm hmVar = this.f38445c;
                rn rnVar = hmVar.f38857c;
                rnVar.f42027e0.f(8);
                this.f38444b.r(0.0f);
                ((org.telegram.ui.ActionBar.n2) rnVar).actionBar.setMenuOffsetSuppressed(false);
                hmVar.f38856b = false;
                break;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f38443a) {
            case 0:
                rn rnVar = this.f38445c.f38857c;
                ((org.telegram.ui.ActionBar.n2) rnVar).actionBar.setMenuOffsetSuppressed(true);
                rn.J3(rnVar);
                rnVar.f42027e0.f(0);
                this.f38444b.r(AndroidUtilities.dp(48.0f));
                break;
            default:
                hm hmVar = this.f38445c;
                ((org.telegram.ui.ActionBar.n2) hmVar.f38857c).actionBar.setMenuOffsetSuppressed(true);
                hmVar.f38856b = true;
                break;
        }
    }
}
