package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class pp extends AnimatorListenerAdapter {
    public final int f27113a;
    public final qp f27114b;

    public pp(qp qpVar, int i10) {
        this.f27113a = i10;
        this.f27114b = qpVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27113a) {
            case 0:
                qp qpVar = this.f27114b;
                qpVar.d = null;
                ng ngVar = new ng(this, 29);
                qpVar.e = ngVar;
                AndroidUtilities.runOnUIThread(ngVar, 3000L);
                return;
            default:
                qp qpVar2 = this.f27114b;
                qpVar2.setVisibility(4);
                qpVar2.getClass();
                qpVar2.getClass();
                qpVar2.d = null;
                return;
        }
    }
}
