package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class yp extends AnimatorListenerAdapter {
    public final int f33018a;
    public final zp f33019b;

    public yp(zp zpVar, int i10) {
        this.f33018a = i10;
        this.f33019b = zpVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33018a) {
            case 0:
                zp zpVar = this.f33019b;
                zpVar.d = null;
                xp xpVar = new xp(this, 0);
                zpVar.e = xpVar;
                AndroidUtilities.runOnUIThread(xpVar, 3000L);
                return;
            default:
                zp zpVar2 = this.f33019b;
                zpVar2.setVisibility(4);
                zpVar2.getClass();
                zpVar2.getClass();
                zpVar2.d = null;
                return;
        }
    }
}
