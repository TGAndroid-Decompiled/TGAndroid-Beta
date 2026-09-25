package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class qp extends AnimatorListenerAdapter {
    public final int f27729a;
    public final rp f27730b;

    public qp(rp rpVar, int i10) {
        this.f27729a = i10;
        this.f27730b = rpVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27729a) {
            case 0:
                rp rpVar = this.f27730b;
                rpVar.d = null;
                pg pgVar = new pg(this, 29);
                rpVar.e = pgVar;
                AndroidUtilities.runOnUIThread(pgVar, 3000L);
                return;
            default:
                rp rpVar2 = this.f27730b;
                rpVar2.setVisibility(4);
                rpVar2.getClass();
                rpVar2.getClass();
                rpVar2.d = null;
                return;
        }
    }
}
