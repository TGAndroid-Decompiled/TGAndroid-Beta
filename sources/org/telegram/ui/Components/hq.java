package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class hq extends AnimatorListenerAdapter {
    public final int f26879a;
    public final iq f26880b;

    public hq(iq iqVar, int i10) {
        this.f26879a = i10;
        this.f26880b = iqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26879a) {
            case 0:
                iq iqVar = this.f26880b;
                iqVar.d = null;
                tg tgVar = new tg(this, 29);
                iqVar.f27263e = tgVar;
                AndroidUtilities.runOnUIThread(tgVar, 3000L);
                return;
            default:
                iq iqVar2 = this.f26880b;
                iqVar2.setVisibility(4);
                iqVar2.getClass();
                iqVar2.getClass();
                iqVar2.d = null;
                return;
        }
    }
}
