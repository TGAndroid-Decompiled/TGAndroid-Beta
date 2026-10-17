package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class zp extends AnimatorListenerAdapter {
    public final int f32988a;
    public final aq f32989b;

    public zp(aq aqVar, int i10) {
        this.f32988a = i10;
        this.f32989b = aqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32988a) {
            case 0:
                aq aqVar = this.f32989b;
                aqVar.d = null;
                pg pgVar = new pg(this, 29);
                aqVar.e = pgVar;
                AndroidUtilities.runOnUIThread(pgVar, 3000L);
                return;
            default:
                aq aqVar2 = this.f32989b;
                aqVar2.setVisibility(4);
                aqVar2.getClass();
                aqVar2.getClass();
                aqVar2.d = null;
                return;
        }
    }
}
