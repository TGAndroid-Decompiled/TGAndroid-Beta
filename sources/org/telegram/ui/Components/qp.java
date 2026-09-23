package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class qp extends AnimatorListenerAdapter {
    public final int f27419a;
    public final rp f27420b;

    public qp(rp rpVar, int i10) {
        this.f27419a = i10;
        this.f27420b = rpVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27419a) {
            case 0:
                rp rpVar = this.f27420b;
                rpVar.d = null;
                og ogVar = new og(this, 29);
                rpVar.e = ogVar;
                AndroidUtilities.runOnUIThread(ogVar, 3000L);
                return;
            default:
                rp rpVar2 = this.f27420b;
                rpVar2.setVisibility(4);
                rpVar2.getClass();
                rpVar2.getClass();
                rpVar2.d = null;
                return;
        }
    }
}
