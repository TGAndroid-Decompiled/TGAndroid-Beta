package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ei extends AnimatorListenerAdapter {
    public final int f47231a;
    public final bn f47232b;

    public ei(bn bnVar, int i7) {
        this.f47231a = i7;
        this.f47232b = bnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        bj bjVar;
        switch (this.f47231a) {
            case 0:
                bn bnVar = this.f47232b;
                org.telegram.ui.Components.e50 e50Var = bnVar.f46135q3;
                if (e50Var != null) {
                    e50Var.setIsMessageTransition(false);
                    bnVar.f46135q3.d(true);
                    bnVar.f46135q3.setVisibility(4);
                    return;
                }
                return;
            case 1:
                bn bnVar2 = this.f47232b;
                bnVar2.X9 = org.telegram.messenger.g0.L(30.0f);
                bnVar2.M9();
                return;
            case 2:
                bn bnVar3 = this.f47232b;
                if (bnVar3.fragmentView != null && (bjVar = bnVar3.A0) != null) {
                    bjVar.invalidate();
                    bnVar3.fragmentView.invalidate();
                    return;
                }
                return;
            case 3:
                this.f47232b.R.setVisibility(4);
                return;
            case 4:
                bn bnVar4 = this.f47232b;
                if (animator.equals(bnVar4.f46199v3)) {
                    bnVar4.f46199v3 = null;
                    return;
                }
                return;
            case 5:
                bn bnVar5 = this.f47232b;
                if (animator.equals(bnVar5.f46199v3)) {
                    bnVar5.f46199v3 = null;
                    return;
                }
                return;
            case 6:
                bn bnVar6 = this.f47232b;
                if (animator.equals(bnVar6.f46213w3)) {
                    bnVar6.f46226x3 = 1.0f;
                    bnVar6.Tc();
                    bnVar6.f46213w3 = null;
                    return;
                }
                return;
            case 7:
                bn bnVar7 = this.f47232b;
                if (animator.equals(bnVar7.f46213w3)) {
                    bnVar7.f46226x3 = 0.0f;
                    bnVar7.Tc();
                    bnVar7.f46213w3 = null;
                    return;
                }
                return;
            case 8:
                this.f47232b.f46024h5 = null;
                return;
            case 9:
                bn bnVar8 = this.f47232b;
                bnVar8.f45949bb = 1.0f;
                bnVar8.f45923a0.setVisibility(4);
                bnVar8.f45967d1.setVisibility(4);
                bnVar8.M9();
                return;
            default:
                bn bnVar9 = this.f47232b;
                bnVar9.f45949bb = 0.0f;
                bnVar9.M9();
                return;
        }
    }
}
