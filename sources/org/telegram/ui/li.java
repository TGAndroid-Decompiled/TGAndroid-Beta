package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class li extends AnimatorListenerAdapter {
    public final int f40145a;
    public final qn f40146b;

    public li(qn qnVar, int i9) {
        this.f40145a = i9;
        this.f40146b = qnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ij ijVar;
        switch (this.f40145a) {
            case 0:
                qn qnVar = this.f40146b;
                uk ukVar = qnVar.X2;
                if (ukVar != null) {
                    ukVar.setIsMessageTransition(false);
                    qnVar.X2.h(true);
                    qnVar.X2.setVisibility(4);
                    return;
                }
                return;
            case 1:
                qn qnVar2 = this.f40146b;
                qnVar2.f42122w9 = AndroidUtilities.dp(30.0f);
                qnVar2.o9();
                return;
            case 2:
                qn qnVar3 = this.f40146b;
                if (qnVar3.fragmentView != null && (ijVar = qnVar3.f42077t0) != null) {
                    ijVar.invalidate();
                    qnVar3.fragmentView.invalidate();
                    return;
                }
                return;
            case 3:
                this.f40146b.L.setVisibility(4);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new ri(this, 3), 2000L);
                return;
            case 5:
                qn qnVar4 = this.f40146b;
                if (animator.equals(qnVar4.f41868c3)) {
                    qnVar4.f41868c3 = null;
                    return;
                }
                return;
            case 6:
                qn qnVar5 = this.f40146b;
                if (animator.equals(qnVar5.f41868c3)) {
                    qnVar5.f41868c3 = null;
                    return;
                }
                return;
            case 7:
                qn qnVar6 = this.f40146b;
                if (animator.equals(qnVar6.f41881d3)) {
                    qnVar6.f41894e3 = 1.0f;
                    qnVar6.lc();
                    qnVar6.f41881d3 = null;
                    return;
                }
                return;
            case 8:
                qn qnVar7 = this.f40146b;
                if (animator.equals(qnVar7.f41881d3)) {
                    qnVar7.f41894e3 = 0.0f;
                    qnVar7.lc();
                    qnVar7.f41881d3 = null;
                    return;
                }
                return;
            case 9:
                this.f40146b.P4 = null;
                return;
            case 10:
                qn qnVar8 = this.f40146b;
                qnVar8.f42163za = 1.0f;
                qnVar8.U.setVisibility(4);
                qnVar8.K0.setVisibility(4);
                qnVar8.o9();
                return;
            default:
                qn qnVar9 = this.f40146b;
                qnVar9.f42163za = 0.0f;
                qnVar9.o9();
                return;
        }
    }
}
