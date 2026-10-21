package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class zp extends AnimatorListenerAdapter {
    public final int f33013a;
    public final aq f33014b;

    public zp(aq aqVar, int i10) {
        this.f33013a = i10;
        this.f33014b = aqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33013a) {
            case 0:
                aq aqVar = this.f33014b;
                aqVar.d = null;
                pg pgVar = new pg(this, 29);
                aqVar.e = pgVar;
                AndroidUtilities.runOnUIThread(pgVar, 3000L);
                return;
            default:
                aq aqVar2 = this.f33014b;
                aqVar2.setVisibility(4);
                aqVar2.getClass();
                aqVar2.getClass();
                aqVar2.d = null;
                return;
        }
    }
}
