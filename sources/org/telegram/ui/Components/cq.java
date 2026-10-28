package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class cq extends AnimatorListenerAdapter {
    public final int f27224a;
    public final dq f27225b;

    public cq(dq dqVar, int i10) {
        this.f27224a = i10;
        this.f27225b = dqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27224a) {
            case 0:
                dq dqVar = this.f27225b;
                dqVar.d = null;
                cp cpVar = new cp(this, 1);
                dqVar.e = cpVar;
                AndroidUtilities.runOnUIThread(cpVar, 3000L);
                return;
            default:
                dq dqVar2 = this.f27225b;
                dqVar2.setVisibility(4);
                dqVar2.getClass();
                dqVar2.getClass();
                dqVar2.d = null;
                return;
        }
    }
}
