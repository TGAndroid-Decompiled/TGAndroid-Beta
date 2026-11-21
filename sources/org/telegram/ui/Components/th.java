package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class th extends AnimatorListenerAdapter {
    public final int f39917a;
    public final boolean f39918b;
    public final ai f39919c;

    public th(ai aiVar, boolean z10, int i7) {
        this.f39917a = i7;
        this.f39919c = aiVar;
        this.f39918b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        switch (this.f39917a) {
            case 0:
                ai aiVar = this.f39919c;
                ui uiVar = aiVar.f33519e;
                boolean z10 = this.f39918b;
                if (!z10) {
                    uiVar.C3.setVisibility(8);
                } else {
                    uiVar.f40445v3.setVisibility(8);
                }
                if (z10) {
                    i7 = org.telegram.messenger.g0.L(36.0f);
                } else {
                    i7 = 0;
                }
                for (int i10 = 0; i10 < uiVar.f40444v2.size(); i10++) {
                    ((ki.s3) uiVar.f40444v2.valueAt(i10)).setMeasureOffsetY(i7);
                }
                if (aiVar.f33516a == animator) {
                    aiVar.f33516a = null;
                    return;
                }
                return;
            default:
                ui uiVar2 = this.f39919c.f33519e;
                boolean z11 = this.f39918b;
                uiVar2.f40461z3 = z11;
                if (!z11) {
                    uiVar2.A3.setVisibility(8);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f39917a) {
            case 0:
                ui uiVar = this.f39919c.f33519e;
                if (this.f39918b) {
                    uiVar.C3.setAlpha(0.0f);
                    uiVar.C3.setVisibility(0);
                    int L = org.telegram.messenger.g0.L(36.0f);
                    for (int i7 = 0; i7 < uiVar.f40444v2.size(); i7++) {
                        ((ki.s3) uiVar.f40444v2.valueAt(i7)).setMeasureOffsetY(L);
                    }
                    return;
                }
                uiVar.f40445v3.setAlpha(0.0f);
                uiVar.f40445v3.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
