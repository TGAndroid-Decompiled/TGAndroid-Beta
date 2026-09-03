package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class mp extends AnimatorListenerAdapter {
    public final int f27106a;
    public final np f27107b;

    public mp(np npVar, int i10) {
        this.f27106a = i10;
        this.f27107b = npVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27106a) {
            case 0:
                np npVar = this.f27107b;
                npVar.d = null;
                fg fgVar = new fg(this, 29);
                npVar.e = fgVar;
                AndroidUtilities.runOnUIThread(fgVar, 3000L);
                return;
            default:
                np npVar2 = this.f27107b;
                npVar2.setVisibility(4);
                npVar2.getClass();
                npVar2.getClass();
                npVar2.d = null;
                return;
        }
    }
}
