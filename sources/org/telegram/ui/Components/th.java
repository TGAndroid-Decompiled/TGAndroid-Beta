package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class th extends AnimatorListenerAdapter {
    public final int f39863a;
    public final boolean f39864b;
    public final ai f39865c;

    public th(ai aiVar, boolean z10, int i7) {
        this.f39863a = i7;
        this.f39865c = aiVar;
        this.f39864b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        switch (this.f39863a) {
            case 0:
                ai aiVar = this.f39865c;
                ui uiVar = aiVar.f33493e;
                boolean z10 = this.f39864b;
                if (!z10) {
                    uiVar.C3.setVisibility(8);
                } else {
                    uiVar.f40422v3.setVisibility(8);
                }
                if (z10) {
                    i7 = org.telegram.messenger.g0.L(36.0f);
                } else {
                    i7 = 0;
                }
                for (int i10 = 0; i10 < uiVar.f40421v2.size(); i10++) {
                    ((ki.s3) uiVar.f40421v2.valueAt(i10)).setMeasureOffsetY(i7);
                }
                if (aiVar.f33490a == animator) {
                    aiVar.f33490a = null;
                    return;
                }
                return;
            default:
                ui uiVar2 = this.f39865c.f33493e;
                boolean z11 = this.f39864b;
                uiVar2.f40438z3 = z11;
                if (!z11) {
                    uiVar2.A3.setVisibility(8);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f39863a) {
            case 0:
                ui uiVar = this.f39865c.f33493e;
                if (this.f39864b) {
                    uiVar.C3.setAlpha(0.0f);
                    uiVar.C3.setVisibility(0);
                    int L = org.telegram.messenger.g0.L(36.0f);
                    for (int i7 = 0; i7 < uiVar.f40421v2.size(); i7++) {
                        ((ki.s3) uiVar.f40421v2.valueAt(i7)).setMeasureOffsetY(L);
                    }
                    return;
                }
                uiVar.f40422v3.setAlpha(0.0f);
                uiVar.f40422v3.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
