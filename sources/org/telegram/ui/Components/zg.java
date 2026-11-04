package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zg extends AnimatorListenerAdapter {
    public final int f41040a;
    public final boolean f41041b;
    public final gh f41042c;

    public zg(gh ghVar, boolean z10, int i3) {
        this.f41040a = i3;
        this.f41042c = ghVar;
        this.f41041b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i3;
        switch (this.f41040a) {
            case 0:
                gh ghVar = this.f41042c;
                bi biVar = ghVar.f34095e;
                boolean z10 = this.f41041b;
                if (!z10) {
                    biVar.f32300z3.setVisibility(8);
                } else {
                    biVar.f32272s3.setVisibility(8);
                }
                if (z10) {
                    i3 = org.telegram.messenger.g0.L(36.0f);
                } else {
                    i3 = 0;
                }
                for (int i10 = 0; i10 < biVar.f32271s2.size(); i10++) {
                    ((ii.d4) biVar.f32271s2.valueAt(i10)).setMeasureOffsetY(i3);
                }
                if (ghVar.f34092a == animator) {
                    ghVar.f34092a = null;
                    return;
                }
                return;
            default:
                bi biVar2 = this.f41042c.f34095e;
                boolean z11 = this.f41041b;
                biVar2.f32288w3 = z11;
                if (!z11) {
                    biVar2.f32292x3.setVisibility(8);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f41040a) {
            case 0:
                bi biVar = this.f41042c.f34095e;
                if (this.f41041b) {
                    biVar.f32300z3.setAlpha(0.0f);
                    biVar.f32300z3.setVisibility(0);
                    int L = org.telegram.messenger.g0.L(36.0f);
                    for (int i3 = 0; i3 < biVar.f32271s2.size(); i3++) {
                        ((ii.d4) biVar.f32271s2.valueAt(i3)).setMeasureOffsetY(L);
                    }
                    return;
                }
                biVar.f32272s3.setAlpha(0.0f);
                biVar.f32272s3.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
