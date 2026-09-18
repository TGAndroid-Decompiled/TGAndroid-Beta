package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class pp extends AnimatorListenerAdapter {
    public final int f27292a;
    public final qp f27293b;

    public pp(qp qpVar, int i10) {
        this.f27292a = i10;
        this.f27293b = qpVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27292a) {
            case 0:
                qp qpVar = this.f27293b;
                qpVar.d = null;
                og ogVar = new og(this, 29);
                qpVar.e = ogVar;
                AndroidUtilities.runOnUIThread(ogVar, 3000L);
                return;
            default:
                qp qpVar2 = this.f27293b;
                qpVar2.setVisibility(4);
                qpVar2.getClass();
                qpVar2.getClass();
                qpVar2.d = null;
                return;
        }
    }
}
