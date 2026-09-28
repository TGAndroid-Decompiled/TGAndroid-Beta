package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class rp extends AnimatorListenerAdapter {
    public final int f28022a;
    public final sp f28023b;

    public rp(sp spVar, int i10) {
        this.f28022a = i10;
        this.f28023b = spVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28022a) {
            case 0:
                sp spVar = this.f28023b;
                spVar.d = null;
                pg pgVar = new pg(this, 29);
                spVar.e = pgVar;
                AndroidUtilities.runOnUIThread(pgVar, 3000L);
                return;
            default:
                sp spVar2 = this.f28023b;
                spVar2.setVisibility(4);
                spVar2.getClass();
                spVar2.getClass();
                spVar2.d = null;
                return;
        }
    }
}
