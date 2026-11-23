package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ei extends AnimatorListenerAdapter {
    public final int f47560a;
    public final bn f47561b;

    public ei(bn bnVar, int i7) {
        this.f47560a = i7;
        this.f47561b = bnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        bj bjVar;
        switch (this.f47560a) {
            case 0:
                bn bnVar = this.f47561b;
                org.telegram.ui.Components.e50 e50Var = bnVar.f46330q3;
                if (e50Var != null) {
                    e50Var.setIsMessageTransition(false);
                    bnVar.f46330q3.d(true);
                    bnVar.f46330q3.setVisibility(4);
                    return;
                }
                return;
            case 1:
                bn bnVar2 = this.f47561b;
                bnVar2.X9 = org.telegram.messenger.g0.L(30.0f);
                bnVar2.M9();
                return;
            case 2:
                bn bnVar3 = this.f47561b;
                if (bnVar3.fragmentView != null && (bjVar = bnVar3.A0) != null) {
                    bjVar.invalidate();
                    bnVar3.fragmentView.invalidate();
                    return;
                }
                return;
            case 3:
                this.f47561b.R.setVisibility(4);
                return;
            case 4:
                bn bnVar4 = this.f47561b;
                if (animator.equals(bnVar4.f46394v3)) {
                    bnVar4.f46394v3 = null;
                    return;
                }
                return;
            case 5:
                bn bnVar5 = this.f47561b;
                if (animator.equals(bnVar5.f46394v3)) {
                    bnVar5.f46394v3 = null;
                    return;
                }
                return;
            case 6:
                bn bnVar6 = this.f47561b;
                if (animator.equals(bnVar6.f46408w3)) {
                    bnVar6.f46421x3 = 1.0f;
                    bnVar6.Tc();
                    bnVar6.f46408w3 = null;
                    return;
                }
                return;
            case 7:
                bn bnVar7 = this.f47561b;
                if (animator.equals(bnVar7.f46408w3)) {
                    bnVar7.f46421x3 = 0.0f;
                    bnVar7.Tc();
                    bnVar7.f46408w3 = null;
                    return;
                }
                return;
            case 8:
                this.f47561b.f46219h5 = null;
                return;
            case 9:
                bn bnVar8 = this.f47561b;
                bnVar8.f46144bb = 1.0f;
                bnVar8.f46118a0.setVisibility(4);
                bnVar8.f46162d1.setVisibility(4);
                bnVar8.M9();
                return;
            default:
                bn bnVar9 = this.f47561b;
                bnVar9.f46144bb = 0.0f;
                bnVar9.M9();
                return;
        }
    }
}
