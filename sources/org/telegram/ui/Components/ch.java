package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ch extends AnimatorListenerAdapter {
    public final int f32688a;
    public final boolean f32689b;
    public final jh f32690c;

    public ch(jh jhVar, boolean z9, int i7) {
        this.f32688a = i7;
        this.f32690c = jhVar;
        this.f32689b = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        switch (this.f32688a) {
            case 0:
                jh jhVar = this.f32690c;
                di diVar = jhVar.f35021e;
                boolean z9 = this.f32689b;
                if (!z9) {
                    diVar.f33072y3.setVisibility(8);
                } else {
                    diVar.f33044r3.setVisibility(8);
                }
                if (z9) {
                    i7 = org.telegram.messenger.g0.L(36.0f);
                } else {
                    i7 = 0;
                }
                for (int i10 = 0; i10 < diVar.f33043r2.size(); i10++) {
                    ((hi.c4) diVar.f33043r2.valueAt(i10)).setMeasureOffsetY(i7);
                }
                if (jhVar.f35018a == animator) {
                    jhVar.f35018a = null;
                    return;
                }
                return;
            default:
                di diVar2 = this.f32690c.f35021e;
                boolean z10 = this.f32689b;
                diVar2.f33060v3 = z10;
                if (!z10) {
                    diVar2.f33064w3.setVisibility(8);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f32688a) {
            case 0:
                di diVar = this.f32690c.f35021e;
                if (this.f32689b) {
                    diVar.f33072y3.setAlpha(0.0f);
                    diVar.f33072y3.setVisibility(0);
                    int L = org.telegram.messenger.g0.L(36.0f);
                    for (int i7 = 0; i7 < diVar.f33043r2.size(); i7++) {
                        ((hi.c4) diVar.f33043r2.valueAt(i7)).setMeasureOffsetY(L);
                    }
                    return;
                }
                diVar.f33044r3.setAlpha(0.0f);
                diVar.f33044r3.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
