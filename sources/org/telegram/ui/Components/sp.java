package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class sp extends AnimatorListenerAdapter {
    public final int f28317a;
    public final tp f28318b;

    public sp(tp tpVar, int i10) {
        this.f28317a = i10;
        this.f28318b = tpVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28317a) {
            case 0:
                tp tpVar = this.f28318b;
                tpVar.d = null;
                qg qgVar = new qg(this, 29);
                tpVar.e = qgVar;
                AndroidUtilities.runOnUIThread(qgVar, 3000L);
                return;
            default:
                tp tpVar2 = this.f28318b;
                tpVar2.setVisibility(4);
                tpVar2.getClass();
                tpVar2.getClass();
                tpVar2.d = null;
                return;
        }
    }
}
