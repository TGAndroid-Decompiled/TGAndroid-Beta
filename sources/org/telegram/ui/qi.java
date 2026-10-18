package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class qi extends AnimatorListenerAdapter {
    public final int f40446a;
    public final sn f40447b;

    public qi(sn snVar, int i10) {
        this.f40446a = i10;
        this.f40447b = snVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        pj pjVar;
        switch (this.f40446a) {
            case 0:
                sn snVar = this.f40447b;
                org.telegram.ui.Components.r60 r60Var = snVar.f41181b3;
                if (r60Var != null) {
                    r60Var.setIsMessageTransition(false);
                    snVar.f41181b3.c(true);
                    snVar.f41181b3.setVisibility(4);
                    return;
                }
                return;
            case 1:
                sn snVar2 = this.f40447b;
                snVar2.A9 = AndroidUtilities.dp(30.0f);
                snVar2.t9();
                return;
            case 2:
                sn snVar3 = this.f40447b;
                if (snVar3.fragmentView != null && (pjVar = snVar3.f41454x0) != null) {
                    pjVar.invalidate();
                    snVar3.fragmentView.invalidate();
                    return;
                }
                return;
            case 3:
                this.f40447b.P.setVisibility(4);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new vi(this, 4), 2000L);
                return;
            case 5:
                sn snVar4 = this.f40447b;
                if (animator.equals(snVar4.f41244g3)) {
                    snVar4.f41244g3 = null;
                    return;
                }
                return;
            case 6:
                sn snVar5 = this.f40447b;
                if (animator.equals(snVar5.f41244g3)) {
                    snVar5.f41244g3 = null;
                    return;
                }
                return;
            case 7:
                sn snVar6 = this.f40447b;
                if (animator.equals(snVar6.f41257h3)) {
                    snVar6.f41268i3 = 1.0f;
                    snVar6.pc();
                    snVar6.f41257h3 = null;
                    return;
                }
                return;
            case 8:
                sn snVar7 = this.f40447b;
                if (animator.equals(snVar7.f41257h3)) {
                    snVar7.f41268i3 = 0.0f;
                    snVar7.pc();
                    snVar7.f41257h3 = null;
                    return;
                }
                return;
            case 9:
                this.f40447b.T4 = null;
                return;
            case 10:
                sn snVar8 = this.f40447b;
                snVar8.Ea = 1.0f;
                snVar8.Y.setVisibility(4);
                snVar8.O0.setVisibility(4);
                snVar8.t9();
                return;
            default:
                sn snVar9 = this.f40447b;
                snVar9.Ea = 0.0f;
                snVar9.t9();
                return;
        }
    }
}
