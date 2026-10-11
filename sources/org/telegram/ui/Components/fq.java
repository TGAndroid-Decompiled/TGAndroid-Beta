package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class fq extends AnimatorListenerAdapter {
    public final int f26461a;
    public final gq f26462b;

    public fq(gq gqVar, int i10) {
        this.f26461a = i10;
        this.f26462b = gqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26461a) {
            case 0:
                gq gqVar = this.f26462b;
                gqVar.d = null;
                rg rgVar = new rg(this, 29);
                gqVar.f26803e = rgVar;
                AndroidUtilities.runOnUIThread(rgVar, 3000L);
                return;
            default:
                gq gqVar2 = this.f26462b;
                gqVar2.setVisibility(4);
                gqVar2.getClass();
                gqVar2.getClass();
                gqVar2.d = null;
                return;
        }
    }
}
