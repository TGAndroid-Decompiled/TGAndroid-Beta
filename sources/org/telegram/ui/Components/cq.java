package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class cq extends AnimatorListenerAdapter {
    public final int f27232a;
    public final dq f27233b;

    public cq(dq dqVar, int i10) {
        this.f27232a = i10;
        this.f27233b = dqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27232a) {
            case 0:
                dq dqVar = this.f27233b;
                dqVar.d = null;
                bq bqVar = new bq(this, 0);
                dqVar.e = bqVar;
                AndroidUtilities.runOnUIThread(bqVar, 3000L);
                return;
            default:
                dq dqVar2 = this.f27233b;
                dqVar2.setVisibility(4);
                dqVar2.getClass();
                dqVar2.getClass();
                dqVar2.d = null;
                return;
        }
    }
}
