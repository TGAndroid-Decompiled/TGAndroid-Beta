package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ch extends AnimatorListenerAdapter {
    public final int f32566a;
    public final boolean f32567b;
    public final jh f32568c;

    public ch(jh jhVar, boolean z9, int i7) {
        this.f32566a = i7;
        this.f32568c = jhVar;
        this.f32567b = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        switch (this.f32566a) {
            case 0:
                jh jhVar = this.f32568c;
                di diVar = jhVar.f34974e;
                boolean z9 = this.f32567b;
                if (!z9) {
                    diVar.f32967y3.setVisibility(8);
                } else {
                    diVar.f32939r3.setVisibility(8);
                }
                if (z9) {
                    i7 = org.telegram.messenger.g0.L(36.0f);
                } else {
                    i7 = 0;
                }
                for (int i10 = 0; i10 < diVar.f32938r2.size(); i10++) {
                    ((hi.c4) diVar.f32938r2.valueAt(i10)).setMeasureOffsetY(i7);
                }
                if (jhVar.f34971a == animator) {
                    jhVar.f34971a = null;
                    return;
                }
                return;
            default:
                di diVar2 = this.f32568c.f34974e;
                boolean z10 = this.f32567b;
                diVar2.f32955v3 = z10;
                if (!z10) {
                    diVar2.f32959w3.setVisibility(8);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f32566a) {
            case 0:
                di diVar = this.f32568c.f34974e;
                if (this.f32567b) {
                    diVar.f32967y3.setAlpha(0.0f);
                    diVar.f32967y3.setVisibility(0);
                    int L = org.telegram.messenger.g0.L(36.0f);
                    for (int i7 = 0; i7 < diVar.f32938r2.size(); i7++) {
                        ((hi.c4) diVar.f32938r2.valueAt(i7)).setMeasureOffsetY(L);
                    }
                    return;
                }
                diVar.f32939r3.setAlpha(0.0f);
                diVar.f32939r3.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
