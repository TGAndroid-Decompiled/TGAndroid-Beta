package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class oi extends AnimatorListenerAdapter {
    public final int f41181a;
    public final tn f41182b;

    public oi(tn tnVar, int i10) {
        this.f41181a = i10;
        this.f41182b = tnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        lj ljVar;
        switch (this.f41181a) {
            case 0:
                tn tnVar = this.f41182b;
                xk xkVar = tnVar.X2;
                if (xkVar != null) {
                    xkVar.setIsMessageTransition(false);
                    tnVar.X2.h(true);
                    tnVar.X2.setVisibility(4);
                    return;
                }
                return;
            case 1:
                tn tnVar2 = this.f41182b;
                tnVar2.f43022w9 = AndroidUtilities.dp(30.0f);
                tnVar2.o9();
                return;
            case 2:
                tn tnVar3 = this.f41182b;
                if (tnVar3.fragmentView != null && (ljVar = tnVar3.f42973t0) != null) {
                    ljVar.invalidate();
                    tnVar3.fragmentView.invalidate();
                    return;
                }
                return;
            case 3:
                this.f41182b.L.setVisibility(4);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new ui(this, 3), 2000L);
                return;
            case 5:
                tn tnVar4 = this.f41182b;
                if (animator.equals(tnVar4.c3)) {
                    tnVar4.c3 = null;
                    return;
                }
                return;
            case 6:
                tn tnVar5 = this.f41182b;
                if (animator.equals(tnVar5.c3)) {
                    tnVar5.c3 = null;
                    return;
                }
                return;
            case 7:
                tn tnVar6 = this.f41182b;
                if (animator.equals(tnVar6.f42778d3)) {
                    tnVar6.f42791e3 = 1.0f;
                    tnVar6.lc();
                    tnVar6.f42778d3 = null;
                    return;
                }
                return;
            case 8:
                tn tnVar7 = this.f41182b;
                if (animator.equals(tnVar7.f42778d3)) {
                    tnVar7.f42791e3 = 0.0f;
                    tnVar7.lc();
                    tnVar7.f42778d3 = null;
                    return;
                }
                return;
            case 9:
                this.f41182b.P4 = null;
                return;
            case 10:
                tn tnVar8 = this.f41182b;
                tnVar8.f43060za = 1.0f;
                tnVar8.U.setVisibility(4);
                tnVar8.K0.setVisibility(4);
                tnVar8.o9();
                return;
            default:
                tn tnVar9 = this.f41182b;
                tnVar9.f43060za = 0.0f;
                tnVar9.o9();
                return;
        }
    }
}
