package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class op extends AnimatorListenerAdapter {
    public final int f29155a;
    public final pp f29156b;

    public op(pp ppVar, int i10) {
        this.f29155a = i10;
        this.f29156b = ppVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29155a) {
            case 0:
                pp ppVar = this.f29156b;
                ppVar.d = null;
                pg pgVar = new pg(this, 29);
                ppVar.f29456e = pgVar;
                AndroidUtilities.runOnUIThread(pgVar, 3000L);
                return;
            default:
                pp ppVar2 = this.f29156b;
                ppVar2.setVisibility(4);
                ppVar2.getClass();
                ppVar2.getClass();
                ppVar2.d = null;
                return;
        }
    }
}
