package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ei extends AnimatorListenerAdapter {
    public final int f46783a;
    public final an f46784b;

    public ei(an anVar, int i7) {
        this.f46783a = i7;
        this.f46784b = anVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        aj ajVar;
        switch (this.f46783a) {
            case 0:
                an anVar = this.f46784b;
                org.telegram.ui.Components.w40 w40Var = anVar.f45328q3;
                if (w40Var != null) {
                    w40Var.setIsMessageTransition(false);
                    anVar.f45328q3.d(true);
                    anVar.f45328q3.setVisibility(4);
                    return;
                }
                return;
            case 1:
                an anVar2 = this.f46784b;
                anVar2.W9 = org.telegram.messenger.g0.L(30.0f);
                anVar2.M9();
                return;
            case 2:
                an anVar3 = this.f46784b;
                if (anVar3.fragmentView != null && (ajVar = anVar3.A0) != null) {
                    ajVar.invalidate();
                    anVar3.fragmentView.invalidate();
                    return;
                }
                return;
            case 3:
                this.f46784b.R.setVisibility(4);
                return;
            case 4:
                an anVar4 = this.f46784b;
                if (animator.equals(anVar4.f45392v3)) {
                    anVar4.f45392v3 = null;
                    return;
                }
                return;
            case 5:
                an anVar5 = this.f46784b;
                if (animator.equals(anVar5.f45392v3)) {
                    anVar5.f45392v3 = null;
                    return;
                }
                return;
            case 6:
                an anVar6 = this.f46784b;
                if (animator.equals(anVar6.f45406w3)) {
                    anVar6.f45419x3 = 1.0f;
                    anVar6.Tc();
                    anVar6.f45406w3 = null;
                    return;
                }
                return;
            case 7:
                an anVar7 = this.f46784b;
                if (animator.equals(anVar7.f45406w3)) {
                    anVar7.f45419x3 = 0.0f;
                    anVar7.Tc();
                    anVar7.f45406w3 = null;
                    return;
                }
                return;
            case 8:
                this.f46784b.f45204g5 = null;
                return;
            case 9:
                an anVar8 = this.f46784b;
                anVar8.f45128ab = 1.0f;
                anVar8.f45117a0.setVisibility(4);
                anVar8.f45161d1.setVisibility(4);
                anVar8.M9();
                return;
            default:
                an anVar9 = this.f46784b;
                anVar9.f45128ab = 0.0f;
                anVar9.M9();
                return;
        }
    }
}
