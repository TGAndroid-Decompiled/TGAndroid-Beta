package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ai extends AnimatorListenerAdapter {
    public final int f43782a;
    public final wm f43783b;

    public ai(wm wmVar, int i3) {
        this.f43782a = i3;
        this.f43783b = wmVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        wi wiVar;
        switch (this.f43782a) {
            case 0:
                wm wmVar = this.f43783b;
                org.telegram.ui.Components.p40 p40Var = wmVar.f51448q3;
                if (p40Var != null) {
                    p40Var.setIsMessageTransition(false);
                    wmVar.f51448q3.c(true);
                    wmVar.f51448q3.setVisibility(4);
                    return;
                }
                return;
            case 1:
                wm wmVar2 = this.f43783b;
                wmVar2.U9 = org.telegram.messenger.g0.L(30.0f);
                wmVar2.K9();
                return;
            case 2:
                wm wmVar3 = this.f43783b;
                if (wmVar3.fragmentView != null && (wiVar = wmVar3.A0) != null) {
                    wiVar.invalidate();
                    wmVar3.fragmentView.invalidate();
                    return;
                }
                return;
            case 3:
                this.f43783b.R.setVisibility(4);
                return;
            case 4:
                wm wmVar4 = this.f43783b;
                if (animator.equals(wmVar4.f51510v3)) {
                    wmVar4.f51510v3 = null;
                    return;
                }
                return;
            case 5:
                wm wmVar5 = this.f43783b;
                if (animator.equals(wmVar5.f51510v3)) {
                    wmVar5.f51510v3 = null;
                    return;
                }
                return;
            case 6:
                wm wmVar6 = this.f43783b;
                if (animator.equals(wmVar6.f51524w3)) {
                    wmVar6.f51538x3 = 1.0f;
                    wmVar6.Pc();
                    wmVar6.f51524w3 = null;
                    return;
                }
                return;
            case 7:
                wm wmVar7 = this.f43783b;
                if (animator.equals(wmVar7.f51524w3)) {
                    wmVar7.f51538x3 = 0.0f;
                    wmVar7.Pc();
                    wmVar7.f51524w3 = null;
                    return;
                }
                return;
            case 8:
                this.f43783b.f51326g5 = null;
                return;
            case 9:
                wm wmVar8 = this.f43783b;
                wmVar8.Ya = 1.0f;
                wmVar8.f51237a0.setVisibility(4);
                wmVar8.f51279d1.setVisibility(4);
                wmVar8.K9();
                return;
            default:
                wm wmVar9 = this.f43783b;
                wmVar9.Ya = 0.0f;
                wmVar9.K9();
                return;
        }
    }
}
