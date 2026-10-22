package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class oi extends AnimatorListenerAdapter {
    public final int f39904a;
    public final qn f39905b;

    public oi(qn qnVar, int i10) {
        this.f39904a = i10;
        this.f39905b = qnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        nj njVar;
        switch (this.f39904a) {
            case 0:
                qn qnVar = this.f39905b;
                org.telegram.ui.Components.r60 r60Var = qnVar.f40631b3;
                if (r60Var != null) {
                    r60Var.setIsMessageTransition(false);
                    qnVar.f40631b3.c(true);
                    qnVar.f40631b3.setVisibility(4);
                    return;
                }
                return;
            case 1:
                qn qnVar2 = this.f39905b;
                qnVar2.A9 = AndroidUtilities.dp(30.0f);
                qnVar2.t9();
                return;
            case 2:
                qn qnVar3 = this.f39905b;
                if (qnVar3.fragmentView != null && (njVar = qnVar3.f40904x0) != null) {
                    njVar.invalidate();
                    qnVar3.fragmentView.invalidate();
                    return;
                }
                return;
            case 3:
                this.f39905b.P.setVisibility(4);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new ti(this, 4), 2000L);
                return;
            case 5:
                qn qnVar4 = this.f39905b;
                if (animator.equals(qnVar4.f40694g3)) {
                    qnVar4.f40694g3 = null;
                    return;
                }
                return;
            case 6:
                qn qnVar5 = this.f39905b;
                if (animator.equals(qnVar5.f40694g3)) {
                    qnVar5.f40694g3 = null;
                    return;
                }
                return;
            case 7:
                qn qnVar6 = this.f39905b;
                if (animator.equals(qnVar6.f40707h3)) {
                    qnVar6.f40718i3 = 1.0f;
                    qnVar6.qc();
                    qnVar6.f40707h3 = null;
                    return;
                }
                return;
            case 8:
                qn qnVar7 = this.f39905b;
                if (animator.equals(qnVar7.f40707h3)) {
                    qnVar7.f40718i3 = 0.0f;
                    qnVar7.qc();
                    qnVar7.f40707h3 = null;
                    return;
                }
                return;
            case 9:
                this.f39905b.T4 = null;
                return;
            case 10:
                qn qnVar8 = this.f39905b;
                qnVar8.Ea = 1.0f;
                qnVar8.Y.setVisibility(4);
                qnVar8.O0.setVisibility(4);
                qnVar8.t9();
                return;
            default:
                qn qnVar9 = this.f39905b;
                qnVar9.Ea = 0.0f;
                qnVar9.t9();
                return;
        }
    }
}
