package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class aq extends AnimatorListenerAdapter {
    public final int f24823a;
    public final bq f24824b;

    public aq(bq bqVar, int i10) {
        this.f24823a = i10;
        this.f24824b = bqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24823a) {
            case 0:
                bq bqVar = this.f24824b;
                bqVar.d = null;
                zp zpVar = new zp(this, 0);
                bqVar.e = zpVar;
                AndroidUtilities.runOnUIThread(zpVar, 3000L);
                return;
            default:
                bq bqVar2 = this.f24824b;
                bqVar2.setVisibility(4);
                bqVar2.getClass();
                bqVar2.getClass();
                bqVar2.d = null;
                return;
        }
    }
}
