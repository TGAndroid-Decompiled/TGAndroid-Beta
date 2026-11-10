package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gi extends AnimatorListenerAdapter {
    public final int f46099a;
    public final cn f46100b;

    public gi(cn cnVar, int i7) {
        this.f46099a = i7;
        this.f46100b = cnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        cj cjVar;
        switch (this.f46099a) {
            case 0:
                cn cnVar = this.f46100b;
                org.telegram.ui.Components.t40 t40Var = cnVar.f44615p3;
                if (t40Var != null) {
                    t40Var.setIsMessageTransition(false);
                    cnVar.f44615p3.d(true);
                    cnVar.f44615p3.setVisibility(4);
                    return;
                }
                return;
            case 1:
                cn cnVar2 = this.f46100b;
                cnVar2.V9 = org.telegram.messenger.g0.L(30.0f);
                cnVar2.L9();
                return;
            case 2:
                cn cnVar3 = this.f46100b;
                if (cnVar3.fragmentView != null && (cjVar = cnVar3.f44741z0) != null) {
                    cjVar.invalidate();
                    cnVar3.fragmentView.invalidate();
                    return;
                }
                return;
            case 3:
                this.f46100b.Q.setVisibility(4);
                return;
            case 4:
                cn cnVar4 = this.f46100b;
                if (animator.equals(cnVar4.f44679u3)) {
                    cnVar4.f44679u3 = null;
                    return;
                }
                return;
            case 5:
                cn cnVar5 = this.f46100b;
                if (animator.equals(cnVar5.f44679u3)) {
                    cnVar5.f44679u3 = null;
                    return;
                }
                return;
            case 6:
                cn cnVar6 = this.f46100b;
                if (animator.equals(cnVar6.f44692v3)) {
                    cnVar6.f44706w3 = 1.0f;
                    cnVar6.Sc();
                    cnVar6.f44692v3 = null;
                    return;
                }
                return;
            case 7:
                cn cnVar7 = this.f46100b;
                if (animator.equals(cnVar7.f44692v3)) {
                    cnVar7.f44706w3 = 0.0f;
                    cnVar7.Sc();
                    cnVar7.f44692v3 = null;
                    return;
                }
                return;
            case 8:
                this.f46100b.f44493f5 = null;
                return;
            case 9:
                cn cnVar8 = this.f46100b;
                cnVar8.Za = 1.0f;
                cnVar8.Z.setVisibility(4);
                cnVar8.f44448c1.setVisibility(4);
                cnVar8.L9();
                return;
            default:
                cn cnVar9 = this.f46100b;
                cnVar9.Za = 0.0f;
                cnVar9.L9();
                return;
        }
    }
}
