package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class th extends AnimatorListenerAdapter {
    public final int f39909a;
    public final boolean f39910b;
    public final ai f39911c;

    public th(ai aiVar, boolean z10, int i7) {
        this.f39909a = i7;
        this.f39911c = aiVar;
        this.f39910b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        switch (this.f39909a) {
            case 0:
                ai aiVar = this.f39911c;
                ui uiVar = aiVar.f33532e;
                boolean z10 = this.f39910b;
                if (!z10) {
                    uiVar.C3.setVisibility(8);
                } else {
                    uiVar.f40437v3.setVisibility(8);
                }
                if (z10) {
                    i7 = org.telegram.messenger.g0.L(36.0f);
                } else {
                    i7 = 0;
                }
                for (int i10 = 0; i10 < uiVar.f40436v2.size(); i10++) {
                    ((ki.s3) uiVar.f40436v2.valueAt(i10)).setMeasureOffsetY(i7);
                }
                if (aiVar.f33529a == animator) {
                    aiVar.f33529a = null;
                    return;
                }
                return;
            default:
                ui uiVar2 = this.f39911c.f33532e;
                boolean z11 = this.f39910b;
                uiVar2.f40453z3 = z11;
                if (!z11) {
                    uiVar2.A3.setVisibility(8);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f39909a) {
            case 0:
                ui uiVar = this.f39911c.f33532e;
                if (this.f39910b) {
                    uiVar.C3.setAlpha(0.0f);
                    uiVar.C3.setVisibility(0);
                    int L = org.telegram.messenger.g0.L(36.0f);
                    for (int i7 = 0; i7 < uiVar.f40436v2.size(); i7++) {
                        ((ki.s3) uiVar.f40436v2.valueAt(i7)).setMeasureOffsetY(L);
                    }
                    return;
                }
                uiVar.f40437v3.setAlpha(0.0f);
                uiVar.f40437v3.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
