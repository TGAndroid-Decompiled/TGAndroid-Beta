package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class bj extends AnimatorListenerAdapter {
    public final int f36184a;
    public final eo f36185b;

    public bj(eo eoVar, int i10) {
        this.f36184a = i10;
        this.f36185b = eoVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ak akVar;
        switch (this.f36184a) {
            case 0:
                eo eoVar = this.f36185b;
                org.telegram.ui.Components.b70 b70Var = eoVar.f37205b3;
                if (b70Var != null) {
                    b70Var.setIsMessageTransition(false);
                    eoVar.f37205b3.c(true);
                    eoVar.f37205b3.setVisibility(4);
                    return;
                }
                return;
            case 1:
                eo eoVar2 = this.f36185b;
                eoVar2.A9 = AndroidUtilities.dp(30.0f);
                eoVar2.t9();
                return;
            case 2:
                eo eoVar3 = this.f36185b;
                if (eoVar3.fragmentView != null && (akVar = eoVar3.f37478x0) != null) {
                    akVar.invalidate();
                    eoVar3.fragmentView.invalidate();
                    return;
                }
                return;
            case 3:
                this.f36185b.P.setVisibility(4);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new gj(this, 4), 2000L);
                return;
            case 5:
                eo eoVar4 = this.f36185b;
                if (animator.equals(eoVar4.f37269g3)) {
                    eoVar4.f37269g3 = null;
                    return;
                }
                return;
            case 6:
                eo eoVar5 = this.f36185b;
                if (animator.equals(eoVar5.f37269g3)) {
                    eoVar5.f37269g3 = null;
                    return;
                }
                return;
            case 7:
                eo eoVar6 = this.f36185b;
                if (animator.equals(eoVar6.f37280h3)) {
                    eoVar6.f37292i3 = 1.0f;
                    eoVar6.pc();
                    eoVar6.f37280h3 = null;
                    return;
                }
                return;
            case 8:
                eo eoVar7 = this.f36185b;
                if (animator.equals(eoVar7.f37280h3)) {
                    eoVar7.f37292i3 = 0.0f;
                    eoVar7.pc();
                    eoVar7.f37280h3 = null;
                    return;
                }
                return;
            case 9:
                this.f36185b.T4 = null;
                return;
            case 10:
                eo eoVar8 = this.f36185b;
                eoVar8.Ea = 1.0f;
                eoVar8.Y.setVisibility(4);
                eoVar8.O0.setVisibility(4);
                eoVar8.t9();
                return;
            default:
                eo eoVar9 = this.f36185b;
                eoVar9.Ea = 0.0f;
                eoVar9.t9();
                return;
        }
    }
}
