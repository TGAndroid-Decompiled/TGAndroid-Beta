package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bh extends AnimatorListenerAdapter {
    public final int f32264a;
    public final boolean f32265b;
    public final ih f32266c;

    public bh(ih ihVar, boolean z9, int i7) {
        this.f32264a = i7;
        this.f32266c = ihVar;
        this.f32265b = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        switch (this.f32264a) {
            case 0:
                ih ihVar = this.f32266c;
                ci ciVar = ihVar.f34630e;
                boolean z9 = this.f32265b;
                if (!z9) {
                    ciVar.B3.setVisibility(8);
                } else {
                    ciVar.f32657u3.setVisibility(8);
                }
                if (z9) {
                    i7 = org.telegram.messenger.g0.L(36.0f);
                } else {
                    i7 = 0;
                }
                for (int i10 = 0; i10 < ciVar.f32656u2.size(); i10++) {
                    ((hi.c4) ciVar.f32656u2.valueAt(i10)).setMeasureOffsetY(i7);
                }
                if (ihVar.f34627a == animator) {
                    ihVar.f34627a = null;
                    return;
                }
                return;
            default:
                ci ciVar2 = this.f32266c.f34630e;
                boolean z10 = this.f32265b;
                ciVar2.f32673y3 = z10;
                if (!z10) {
                    ciVar2.f32677z3.setVisibility(8);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f32264a) {
            case 0:
                ci ciVar = this.f32266c.f34630e;
                if (this.f32265b) {
                    ciVar.B3.setAlpha(0.0f);
                    ciVar.B3.setVisibility(0);
                    int L = org.telegram.messenger.g0.L(36.0f);
                    for (int i7 = 0; i7 < ciVar.f32656u2.size(); i7++) {
                        ((hi.c4) ciVar.f32656u2.valueAt(i7)).setMeasureOffsetY(L);
                    }
                    return;
                }
                ciVar.f32657u3.setAlpha(0.0f);
                ciVar.f32657u3.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
