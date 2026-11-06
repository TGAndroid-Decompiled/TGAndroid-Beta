package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ei extends AnimatorListenerAdapter {
    public final int f45351a;
    public final an f45352b;

    public ei(an anVar, int i7) {
        this.f45351a = i7;
        this.f45352b = anVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        aj ajVar;
        switch (this.f45351a) {
            case 0:
                an anVar = this.f45352b;
                org.telegram.ui.Components.t40 t40Var = anVar.f43911p3;
                if (t40Var != null) {
                    t40Var.setIsMessageTransition(false);
                    anVar.f43911p3.c(true);
                    anVar.f43911p3.setVisibility(4);
                    return;
                }
                return;
            case 1:
                an anVar2 = this.f45352b;
                anVar2.T9 = org.telegram.messenger.g0.L(30.0f);
                anVar2.K9();
                return;
            case 2:
                an anVar3 = this.f45352b;
                if (anVar3.fragmentView != null && (ajVar = anVar3.f44037z0) != null) {
                    ajVar.invalidate();
                    anVar3.fragmentView.invalidate();
                    return;
                }
                return;
            case 3:
                this.f45352b.Q.setVisibility(4);
                return;
            case 4:
                an anVar4 = this.f45352b;
                if (animator.equals(anVar4.f43975u3)) {
                    anVar4.f43975u3 = null;
                    return;
                }
                return;
            case 5:
                an anVar5 = this.f45352b;
                if (animator.equals(anVar5.f43975u3)) {
                    anVar5.f43975u3 = null;
                    return;
                }
                return;
            case 6:
                an anVar6 = this.f45352b;
                if (animator.equals(anVar6.f43988v3)) {
                    anVar6.f44002w3 = 1.0f;
                    anVar6.Pc();
                    anVar6.f43988v3 = null;
                    return;
                }
                return;
            case 7:
                an anVar7 = this.f45352b;
                if (animator.equals(anVar7.f43988v3)) {
                    anVar7.f44002w3 = 0.0f;
                    anVar7.Pc();
                    anVar7.f43988v3 = null;
                    return;
                }
                return;
            case 8:
                this.f45352b.f43791f5 = null;
                return;
            case 9:
                an anVar8 = this.f45352b;
                anVar8.Xa = 1.0f;
                anVar8.Z.setVisibility(4);
                anVar8.f43746c1.setVisibility(4);
                anVar8.K9();
                return;
            default:
                an anVar9 = this.f45352b;
                anVar9.Xa = 0.0f;
                anVar9.K9();
                return;
        }
    }
}
