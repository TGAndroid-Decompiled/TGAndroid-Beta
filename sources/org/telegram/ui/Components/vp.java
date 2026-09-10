package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class vp extends AnimatorListenerAdapter {
    public final int f28569a;
    public final wp f28570b;

    public vp(wp wpVar, int i10) {
        this.f28569a = i10;
        this.f28570b = wpVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28569a) {
            case 0:
                wp wpVar = this.f28570b;
                wpVar.d = null;
                rg rgVar = new rg(this, 29);
                wpVar.e = rgVar;
                AndroidUtilities.runOnUIThread(rgVar, 3000L);
                return;
            default:
                wp wpVar2 = this.f28570b;
                wpVar2.setVisibility(4);
                wpVar2.getClass();
                wpVar2.getClass();
                wpVar2.d = null;
                return;
        }
    }
}
