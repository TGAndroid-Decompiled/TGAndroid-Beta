package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class th extends AnimatorListenerAdapter {
    public final int f30600a;
    public final boolean f30601b;
    public final bi f30602c;

    public th(bi biVar, boolean z10, int i10) {
        this.f30600a = i10;
        this.f30602c = biVar;
        this.f30601b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f30600a) {
            case 0:
                bi biVar = this.f30602c;
                vi viVar = biVar.f24714e;
                boolean z10 = this.f30601b;
                if (!z10) {
                    viVar.E1.setVisibility(8);
                } else {
                    viVar.f31337x1.setVisibility(8);
                }
                if (z10) {
                    i10 = AndroidUtilities.dp(36.0f);
                } else {
                    i10 = 0;
                }
                for (int i11 = 0; i11 < viVar.f31336x0.size(); i11++) {
                    ((fi.r4) viVar.f31336x0.valueAt(i11)).setMeasureOffsetY(i10);
                }
                if (biVar.f24711a == animator) {
                    biVar.f24711a = null;
                    return;
                }
                return;
            default:
                vi viVar2 = this.f30602c.f24714e;
                boolean z11 = this.f30601b;
                viVar2.B1 = z11;
                if (!z11) {
                    viVar2.C1.setVisibility(8);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f30600a) {
            case 0:
                vi viVar = this.f30602c.f24714e;
                if (this.f30601b) {
                    viVar.E1.setAlpha(0.0f);
                    viVar.E1.setVisibility(0);
                    int dp = AndroidUtilities.dp(36.0f);
                    for (int i10 = 0; i10 < viVar.f31336x0.size(); i10++) {
                        ((fi.r4) viVar.f31336x0.valueAt(i10)).setMeasureOffsetY(dp);
                    }
                    return;
                }
                viVar.f31337x1.setAlpha(0.0f);
                viVar.f31337x1.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
