package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ch extends AnimatorListenerAdapter {
    public final int f32588a;
    public final boolean f32589b;
    public final jh f32590c;

    public ch(jh jhVar, boolean z9, int i7) {
        this.f32588a = i7;
        this.f32590c = jhVar;
        this.f32589b = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        switch (this.f32588a) {
            case 0:
                jh jhVar = this.f32590c;
                di diVar = jhVar.f34982e;
                boolean z9 = this.f32589b;
                if (!z9) {
                    diVar.f33017y3.setVisibility(8);
                } else {
                    diVar.f32989r3.setVisibility(8);
                }
                if (z9) {
                    i7 = org.telegram.messenger.g0.L(36.0f);
                } else {
                    i7 = 0;
                }
                for (int i10 = 0; i10 < diVar.f32988r2.size(); i10++) {
                    ((hi.c4) diVar.f32988r2.valueAt(i10)).setMeasureOffsetY(i7);
                }
                if (jhVar.f34979a == animator) {
                    jhVar.f34979a = null;
                    return;
                }
                return;
            default:
                di diVar2 = this.f32590c.f34982e;
                boolean z10 = this.f32589b;
                diVar2.f33005v3 = z10;
                if (!z10) {
                    diVar2.f33009w3.setVisibility(8);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f32588a) {
            case 0:
                di diVar = this.f32590c.f34982e;
                if (this.f32589b) {
                    diVar.f33017y3.setAlpha(0.0f);
                    diVar.f33017y3.setVisibility(0);
                    int L = org.telegram.messenger.g0.L(36.0f);
                    for (int i7 = 0; i7 < diVar.f32988r2.size(); i7++) {
                        ((hi.c4) diVar.f32988r2.valueAt(i7)).setMeasureOffsetY(L);
                    }
                    return;
                }
                diVar.f32989r3.setAlpha(0.0f);
                diVar.f32989r3.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
