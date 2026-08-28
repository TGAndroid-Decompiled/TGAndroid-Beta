package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class fp extends AnimatorListenerAdapter {
    public final int f28537a;
    public final gp f28538b;

    public fp(gp gpVar, int i9) {
        this.f28537a = i9;
        this.f28538b = gpVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28537a) {
            case 0:
                gp gpVar = this.f28538b;
                gpVar.d = null;
                fg fgVar = new fg(this, 29);
                gpVar.f28834e = fgVar;
                AndroidUtilities.runOnUIThread(fgVar, 3000L);
                return;
            default:
                gp gpVar2 = this.f28538b;
                gpVar2.setVisibility(4);
                gpVar2.getClass();
                gpVar2.getClass();
                gpVar2.d = null;
                return;
        }
    }
}
