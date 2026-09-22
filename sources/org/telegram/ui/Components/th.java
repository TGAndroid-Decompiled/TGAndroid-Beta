package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class th extends AnimatorListenerAdapter {
    public final int f28128a;
    public final boolean f28129b;
    public final bi f28130c;

    public th(bi biVar, boolean z10, int i10) {
        this.f28128a = i10;
        this.f28130c = biVar;
        this.f28129b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f28128a) {
            case 0:
                bi biVar = this.f28130c;
                vi viVar = biVar.e;
                boolean z10 = this.f28129b;
                if (!z10) {
                    viVar.E1.setVisibility(8);
                } else {
                    viVar.f28805x1.setVisibility(8);
                }
                if (z10) {
                    i10 = AndroidUtilities.dp(36.0f);
                } else {
                    i10 = 0;
                }
                for (int i11 = 0; i11 < viVar.f28804x0.size(); i11++) {
                    ((ei.q4) viVar.f28804x0.valueAt(i11)).setMeasureOffsetY(i10);
                }
                if (biVar.f22788a == animator) {
                    biVar.f22788a = null;
                    return;
                }
                return;
            default:
                vi viVar2 = this.f28130c.e;
                boolean z11 = this.f28129b;
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
        switch (this.f28128a) {
            case 0:
                vi viVar = this.f28130c.e;
                if (this.f28129b) {
                    viVar.E1.setAlpha(0.0f);
                    viVar.E1.setVisibility(0);
                    int dp = AndroidUtilities.dp(36.0f);
                    for (int i10 = 0; i10 < viVar.f28804x0.size(); i10++) {
                        ((ei.q4) viVar.f28804x0.valueAt(i10)).setMeasureOffsetY(dp);
                    }
                    return;
                }
                viVar.f28805x1.setAlpha(0.0f);
                viVar.f28805x1.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
