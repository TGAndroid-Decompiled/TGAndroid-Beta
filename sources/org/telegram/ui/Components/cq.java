package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class cq extends AnimatorListenerAdapter {
    public final int f24187a;
    public final dq f24188b;

    public cq(dq dqVar, int i10) {
        this.f24187a = i10;
        this.f24188b = dqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24187a) {
            case 0:
                dq dqVar = this.f24188b;
                dqVar.d = null;
                qg qgVar = new qg(this, 29);
                dqVar.e = qgVar;
                AndroidUtilities.runOnUIThread(qgVar, 3000L);
                return;
            default:
                dq dqVar2 = this.f24188b;
                dqVar2.setVisibility(4);
                dqVar2.getClass();
                dqVar2.getClass();
                dqVar2.d = null;
                return;
        }
    }
}
