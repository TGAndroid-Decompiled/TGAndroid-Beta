package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class pp extends AnimatorListenerAdapter {
    public final int f27393a;
    public final qp f27394b;

    public pp(qp qpVar, int i10) {
        this.f27393a = i10;
        this.f27394b = qpVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27393a) {
            case 0:
                qp qpVar = this.f27394b;
                qpVar.d = null;
                og ogVar = new og(this, 29);
                qpVar.e = ogVar;
                AndroidUtilities.runOnUIThread(ogVar, 3000L);
                return;
            default:
                qp qpVar2 = this.f27394b;
                qpVar2.setVisibility(4);
                qpVar2.getClass();
                qpVar2.getClass();
                qpVar2.d = null;
                return;
        }
    }
}
