package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class sp extends AnimatorListenerAdapter {
    public final int f30850a;
    public final tp f30851b;

    public sp(tp tpVar, int i10) {
        this.f30850a = i10;
        this.f30851b = tpVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30850a) {
            case 0:
                tp tpVar = this.f30851b;
                tpVar.d = null;
                qg qgVar = new qg(this, 29);
                tpVar.f31140e = qgVar;
                AndroidUtilities.runOnUIThread(qgVar, 3000L);
                return;
            default:
                tp tpVar2 = this.f30851b;
                tpVar2.setVisibility(4);
                tpVar2.getClass();
                tpVar2.getClass();
                tpVar2.d = null;
                return;
        }
    }
}
