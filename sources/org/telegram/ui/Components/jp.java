package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class jp extends AnimatorListenerAdapter {
    public final int f29779a;
    public final kp f29780b;

    public jp(kp kpVar, int i10) {
        this.f29779a = i10;
        this.f29780b = kpVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29779a) {
            case 0:
                kp kpVar = this.f29780b;
                kpVar.d = null;
                ig igVar = new ig(this, 29);
                kpVar.f30124e = igVar;
                AndroidUtilities.runOnUIThread(igVar, 3000L);
                return;
            default:
                kp kpVar2 = this.f29780b;
                kpVar2.setVisibility(4);
                kpVar2.getClass();
                kpVar2.getClass();
                kpVar2.d = null;
                return;
        }
    }
}
