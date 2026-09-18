package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class th extends AnimatorListenerAdapter {
    public final int f28389a;
    public final boolean f28390b;
    public final bi f28391c;

    public th(bi biVar, boolean z10, int i10) {
        this.f28389a = i10;
        this.f28391c = biVar;
        this.f28390b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f28389a) {
            case 0:
                bi biVar = this.f28391c;
                vi viVar = biVar.e;
                boolean z10 = this.f28390b;
                if (!z10) {
                    viVar.E1.setVisibility(8);
                } else {
                    viVar.f29079x1.setVisibility(8);
                }
                if (z10) {
                    i10 = AndroidUtilities.dp(36.0f);
                } else {
                    i10 = 0;
                }
                for (int i11 = 0; i11 < viVar.f29078x0.size(); i11++) {
                    ((ei.q4) viVar.f29078x0.valueAt(i11)).setMeasureOffsetY(i10);
                }
                if (biVar.f23011a == animator) {
                    biVar.f23011a = null;
                    return;
                }
                return;
            default:
                vi viVar2 = this.f28391c.e;
                boolean z11 = this.f28390b;
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
        switch (this.f28389a) {
            case 0:
                vi viVar = this.f28391c.e;
                if (this.f28390b) {
                    viVar.E1.setAlpha(0.0f);
                    viVar.E1.setVisibility(0);
                    int dp = AndroidUtilities.dp(36.0f);
                    for (int i10 = 0; i10 < viVar.f29078x0.size(); i10++) {
                        ((ei.q4) viVar.f29078x0.valueAt(i10)).setMeasureOffsetY(dp);
                    }
                    return;
                }
                viVar.f29079x1.setAlpha(0.0f);
                viVar.f29079x1.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
