package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class pp extends AnimatorListenerAdapter {
    public final int f30161a;
    public final qp f30162b;

    public pp(qp qpVar, int i10) {
        this.f30161a = i10;
        this.f30162b = qpVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30161a) {
            case 0:
                qp qpVar = this.f30162b;
                qpVar.d = null;
                fg fgVar = new fg(this, 29);
                qpVar.f30459e = fgVar;
                AndroidUtilities.runOnUIThread(fgVar, 3000L);
                return;
            default:
                qp qpVar2 = this.f30162b;
                qpVar2.setVisibility(4);
                qpVar2.getClass();
                qpVar2.getClass();
                qpVar2.d = null;
                return;
        }
    }
}
