package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

public final class dp extends AnimatorListenerAdapter {

    public final int f27817a;

    public final ep f27818b;

    public dp(ep epVar, int i10) {
        this.f27817a = i10;
        this.f27818b = epVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27817a) {
            case 0:
                ep epVar = this.f27818b;
                epVar.d = null;
                bg bgVar = new bg(this, 29);
                epVar.f28113e = bgVar;
                AndroidUtilities.runOnUIThread(bgVar, 3000L);
                break;
            default:
                ep epVar2 = this.f27818b;
                epVar2.setVisibility(4);
                epVar2.getClass();
                epVar2.getClass();
                epVar2.d = null;
                break;
        }
    }
}
