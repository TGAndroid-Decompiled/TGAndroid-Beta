package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ch extends AnimatorListenerAdapter {
    public final int f32557a;
    public final boolean f32558b;
    public final jh f32559c;

    public ch(jh jhVar, boolean z9, int i7) {
        this.f32557a = i7;
        this.f32559c = jhVar;
        this.f32558b = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        switch (this.f32557a) {
            case 0:
                jh jhVar = this.f32559c;
                di diVar = jhVar.f34961e;
                boolean z9 = this.f32558b;
                if (!z9) {
                    diVar.f33009y3.setVisibility(8);
                } else {
                    diVar.f32981r3.setVisibility(8);
                }
                if (z9) {
                    i7 = org.telegram.messenger.g0.L(36.0f);
                } else {
                    i7 = 0;
                }
                for (int i10 = 0; i10 < diVar.f32980r2.size(); i10++) {
                    ((hi.c4) diVar.f32980r2.valueAt(i10)).setMeasureOffsetY(i7);
                }
                if (jhVar.f34958a == animator) {
                    jhVar.f34958a = null;
                    return;
                }
                return;
            default:
                di diVar2 = this.f32559c.f34961e;
                boolean z10 = this.f32558b;
                diVar2.f32997v3 = z10;
                if (!z10) {
                    diVar2.f33001w3.setVisibility(8);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f32557a) {
            case 0:
                di diVar = this.f32559c.f34961e;
                if (this.f32558b) {
                    diVar.f33009y3.setAlpha(0.0f);
                    diVar.f33009y3.setVisibility(0);
                    int L = org.telegram.messenger.g0.L(36.0f);
                    for (int i7 = 0; i7 < diVar.f32980r2.size(); i7++) {
                        ((hi.c4) diVar.f32980r2.valueAt(i7)).setMeasureOffsetY(L);
                    }
                    return;
                }
                diVar.f32981r3.setAlpha(0.0f);
                diVar.f32981r3.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
