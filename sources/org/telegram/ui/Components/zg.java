package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zg extends AnimatorListenerAdapter {
    public final int f33149a;
    public final boolean f33150b;
    public final gh f33151c;

    public zg(gh ghVar, boolean z10, int i10) {
        this.f33149a = i10;
        this.f33151c = ghVar;
        this.f33150b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f33149a) {
            case 0:
                gh ghVar = this.f33151c;
                bi biVar = ghVar.e;
                boolean z10 = this.f33150b;
                if (!z10) {
                    biVar.y3.setVisibility(8);
                } else {
                    biVar.f24809r3.setVisibility(8);
                }
                if (z10) {
                    i10 = org.telegram.messenger.i0.L(36.0f);
                } else {
                    i10 = 0;
                }
                for (int i11 = 0; i11 < biVar.f24808r2.size(); i11++) {
                    ((xh.j3) biVar.f24808r2.valueAt(i11)).setMeasureOffsetY(i10);
                }
                if (ghVar.f26433a == animator) {
                    ghVar.f26433a = null;
                    return;
                }
                return;
            default:
                bi biVar2 = this.f33151c.e;
                boolean z11 = this.f33150b;
                biVar2.f24825v3 = z11;
                if (!z11) {
                    biVar2.f24829w3.setVisibility(8);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f33149a) {
            case 0:
                bi biVar = this.f33151c.e;
                if (this.f33150b) {
                    biVar.y3.setAlpha(0.0f);
                    biVar.y3.setVisibility(0);
                    int L = org.telegram.messenger.i0.L(36.0f);
                    for (int i10 = 0; i10 < biVar.f24808r2.size(); i10++) {
                        ((xh.j3) biVar.f24808r2.valueAt(i10)).setMeasureOffsetY(L);
                    }
                    return;
                }
                biVar.f24809r3.setAlpha(0.0f);
                biVar.f24809r3.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
