package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bi extends AnimatorListenerAdapter {
    public final int f36262a;
    public final un f36263b;

    public bi(un unVar, int i10) {
        this.f36262a = i10;
        this.f36263b = unVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        vj vjVar;
        switch (this.f36262a) {
            case 0:
                un unVar = this.f36263b;
                unVar.Xa = 0.0f;
                unVar.A9();
                return;
            case 1:
                un unVar2 = this.f36263b;
                org.telegram.ui.Components.j50 j50Var = unVar2.f42370p3;
                if (j50Var != null) {
                    j50Var.setIsMessageTransition(false);
                    unVar2.f42370p3.c(true);
                    unVar2.f42370p3.setVisibility(4);
                    return;
                }
                return;
            case 2:
                un unVar3 = this.f36263b;
                unVar3.T9 = org.telegram.messenger.i0.L(30.0f);
                unVar3.A9();
                return;
            case 3:
                un unVar4 = this.f36263b;
                if (unVar4.fragmentView != null && (vjVar = unVar4.f42492z0) != null) {
                    vjVar.invalidate();
                    unVar4.fragmentView.invalidate();
                    return;
                }
                return;
            case 4:
                this.f36263b.Q.setVisibility(4);
                return;
            case 5:
                org.telegram.messenger.i0.h3(new rh(this, 5), 2000L);
                return;
            case 6:
                un unVar5 = this.f36263b;
                if (animator.equals(unVar5.f42432u3)) {
                    unVar5.f42432u3 = null;
                    return;
                }
                return;
            case 7:
                un unVar6 = this.f36263b;
                if (animator.equals(unVar6.f42432u3)) {
                    unVar6.f42432u3 = null;
                    return;
                }
                return;
            case 8:
                un unVar7 = this.f36263b;
                if (animator.equals(unVar7.f42444v3)) {
                    unVar7.f42457w3 = 1.0f;
                    unVar7.Fc();
                    unVar7.f42444v3 = null;
                    return;
                }
                return;
            case 9:
                un unVar8 = this.f36263b;
                if (animator.equals(unVar8.f42444v3)) {
                    unVar8.f42457w3 = 0.0f;
                    unVar8.Fc();
                    unVar8.f42444v3 = null;
                    return;
                }
                return;
            case 10:
                this.f36263b.f42249f5 = null;
                return;
            default:
                un unVar9 = this.f36263b;
                unVar9.Xa = 1.0f;
                unVar9.Z.setVisibility(4);
                unVar9.f42207c1.setVisibility(4);
                unVar9.A9();
                return;
        }
    }
}
