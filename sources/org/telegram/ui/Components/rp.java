package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class rp extends AnimatorListenerAdapter {
    public final int f28024a;
    public final sp f28025b;

    public rp(sp spVar, int i10) {
        this.f28024a = i10;
        this.f28025b = spVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28024a) {
            case 0:
                sp spVar = this.f28025b;
                spVar.d = null;
                pg pgVar = new pg(this, 29);
                spVar.e = pgVar;
                AndroidUtilities.runOnUIThread(pgVar, 3000L);
                return;
            default:
                sp spVar2 = this.f28025b;
                spVar2.setVisibility(4);
                spVar2.getClass();
                spVar2.getClass();
                spVar2.d = null;
                return;
        }
    }
}
