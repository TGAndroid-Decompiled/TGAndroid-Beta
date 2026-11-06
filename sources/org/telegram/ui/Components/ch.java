package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ch extends AnimatorListenerAdapter {
    public final int f32570a;
    public final boolean f32571b;
    public final jh f32572c;

    public ch(jh jhVar, boolean z9, int i7) {
        this.f32570a = i7;
        this.f32572c = jhVar;
        this.f32571b = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        switch (this.f32570a) {
            case 0:
                jh jhVar = this.f32572c;
                di diVar = jhVar.f34935e;
                boolean z9 = this.f32571b;
                if (!z9) {
                    diVar.f32980y3.setVisibility(8);
                } else {
                    diVar.f32952r3.setVisibility(8);
                }
                if (z9) {
                    i7 = org.telegram.messenger.g0.L(36.0f);
                } else {
                    i7 = 0;
                }
                for (int i10 = 0; i10 < diVar.f32951r2.size(); i10++) {
                    ((hi.c4) diVar.f32951r2.valueAt(i10)).setMeasureOffsetY(i7);
                }
                if (jhVar.f34932a == animator) {
                    jhVar.f34932a = null;
                    return;
                }
                return;
            default:
                di diVar2 = this.f32572c.f34935e;
                boolean z10 = this.f32571b;
                diVar2.f32968v3 = z10;
                if (!z10) {
                    diVar2.f32972w3.setVisibility(8);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f32570a) {
            case 0:
                di diVar = this.f32572c.f34935e;
                if (this.f32571b) {
                    diVar.f32980y3.setAlpha(0.0f);
                    diVar.f32980y3.setVisibility(0);
                    int L = org.telegram.messenger.g0.L(36.0f);
                    for (int i7 = 0; i7 < diVar.f32951r2.size(); i7++) {
                        ((hi.c4) diVar.f32951r2.valueAt(i7)).setMeasureOffsetY(L);
                    }
                    return;
                }
                diVar.f32952r3.setAlpha(0.0f);
                diVar.f32952r3.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
