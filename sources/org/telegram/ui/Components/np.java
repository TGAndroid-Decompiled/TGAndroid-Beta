package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class np extends AnimatorListenerAdapter {
    public final int f27332a;
    public final op f27333b;

    public np(op opVar, int i10) {
        this.f27332a = i10;
        this.f27333b = opVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27332a) {
            case 0:
                op opVar = this.f27333b;
                opVar.d = null;
                fg fgVar = new fg(this, 29);
                opVar.e = fgVar;
                AndroidUtilities.runOnUIThread(fgVar, 3000L);
                return;
            default:
                op opVar2 = this.f27333b;
                opVar2.setVisibility(4);
                opVar2.getClass();
                opVar2.getClass();
                opVar2.d = null;
                return;
        }
    }
}
