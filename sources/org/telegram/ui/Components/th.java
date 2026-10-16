package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class th extends AnimatorListenerAdapter {
    public final int f29068a;
    public final boolean f29069b;
    public final bi f29070c;

    public th(bi biVar, boolean z10, int i10) {
        this.f29068a = i10;
        this.f29070c = biVar;
        this.f29069b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f29068a) {
            case 0:
                bi biVar = this.f29070c;
                vi viVar = biVar.e;
                boolean z10 = this.f29069b;
                if (!z10) {
                    viVar.H1.setVisibility(8);
                } else {
                    viVar.A1.setVisibility(8);
                }
                if (z10) {
                    i10 = AndroidUtilities.dp(36.0f);
                } else {
                    i10 = 0;
                }
                for (int i11 = 0; i11 < viVar.A0.size(); i11++) {
                    ((fi.q4) viVar.A0.valueAt(i11)).setMeasureOffsetY(i10);
                }
                if (biVar.f23457a == animator) {
                    biVar.f23457a = null;
                    return;
                }
                return;
            default:
                vi viVar2 = this.f29070c.e;
                boolean z11 = this.f29069b;
                viVar2.E1 = z11;
                if (!z11) {
                    viVar2.F1.setVisibility(8);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f29068a) {
            case 0:
                vi viVar = this.f29070c.e;
                if (this.f29069b) {
                    viVar.H1.setAlpha(0.0f);
                    viVar.H1.setVisibility(0);
                    int dp = AndroidUtilities.dp(36.0f);
                    for (int i10 = 0; i10 < viVar.A0.size(); i10++) {
                        ((fi.q4) viVar.A0.valueAt(i10)).setMeasureOffsetY(dp);
                    }
                    return;
                }
                viVar.A1.setAlpha(0.0f);
                viVar.A1.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
