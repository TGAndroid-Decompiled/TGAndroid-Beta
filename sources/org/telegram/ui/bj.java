package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class bj extends AnimatorListenerAdapter {
    public final int f34585a;
    public final fo f34586b;

    public bj(fo foVar, int i10) {
        this.f34585a = i10;
        this.f34586b = foVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ak akVar;
        switch (this.f34585a) {
            case 0:
                fo foVar = this.f34586b;
                org.telegram.ui.Components.u60 u60Var = foVar.f35887b3;
                if (u60Var != null) {
                    u60Var.setIsMessageTransition(false);
                    foVar.f35887b3.c(true);
                    foVar.f35887b3.setVisibility(4);
                    return;
                }
                return;
            case 1:
                fo foVar2 = this.f34586b;
                foVar2.A9 = AndroidUtilities.dp(30.0f);
                foVar2.t9();
                return;
            case 2:
                fo foVar3 = this.f34586b;
                if (foVar3.fragmentView != null && (akVar = foVar3.f36160x0) != null) {
                    akVar.invalidate();
                    foVar3.fragmentView.invalidate();
                    return;
                }
                return;
            case 3:
                this.f34586b.P.setVisibility(4);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new gj(this, 4), 2000L);
                return;
            case 5:
                fo foVar4 = this.f34586b;
                if (animator.equals(foVar4.f35950g3)) {
                    foVar4.f35950g3 = null;
                    return;
                }
                return;
            case 6:
                fo foVar5 = this.f34586b;
                if (animator.equals(foVar5.f35950g3)) {
                    foVar5.f35950g3 = null;
                    return;
                }
                return;
            case 7:
                fo foVar6 = this.f34586b;
                if (animator.equals(foVar6.f35963h3)) {
                    foVar6.f35974i3 = 1.0f;
                    foVar6.pc();
                    foVar6.f35963h3 = null;
                    return;
                }
                return;
            case 8:
                fo foVar7 = this.f34586b;
                if (animator.equals(foVar7.f35963h3)) {
                    foVar7.f35974i3 = 0.0f;
                    foVar7.pc();
                    foVar7.f35963h3 = null;
                    return;
                }
                return;
            case 9:
                this.f34586b.T4 = null;
                return;
            case 10:
                fo foVar8 = this.f34586b;
                foVar8.Ea = 1.0f;
                foVar8.Y.setVisibility(4);
                foVar8.O0.setVisibility(4);
                foVar8.t9();
                return;
            default:
                fo foVar9 = this.f34586b;
                foVar9.Ea = 0.0f;
                foVar9.t9();
                return;
        }
    }
}
