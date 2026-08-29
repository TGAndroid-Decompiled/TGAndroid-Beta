package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class lh extends AnimatorListenerAdapter {
    public final int f30325a;
    public final boolean f30326b;
    public final uh f30327c;

    public lh(uh uhVar, boolean z10, int i10) {
        this.f30325a = i10;
        this.f30327c = uhVar;
        this.f30326b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f30325a) {
            case 0:
                uh uhVar = this.f30327c;
                ni niVar = uhVar.f33236e;
                boolean z10 = this.f30326b;
                if (!z10) {
                    niVar.A1.setVisibility(8);
                } else {
                    niVar.f31049t1.setVisibility(8);
                }
                if (z10) {
                    i10 = AndroidUtilities.dp(36.0f);
                } else {
                    i10 = 0;
                }
                for (int i11 = 0; i11 < niVar.f31048t0.size(); i11++) {
                    ((ph.n3) niVar.f31048t0.valueAt(i11)).setMeasureOffsetY(i10);
                }
                if (uhVar.f33233a == animator) {
                    uhVar.f33233a = null;
                    return;
                }
                return;
            default:
                ni niVar2 = this.f30327c.f33236e;
                boolean z11 = this.f30326b;
                niVar2.f31063x1 = z11;
                if (!z11) {
                    niVar2.f31067y1.setVisibility(8);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f30325a) {
            case 0:
                ni niVar = this.f30327c.f33236e;
                if (this.f30326b) {
                    niVar.A1.setAlpha(0.0f);
                    niVar.A1.setVisibility(0);
                    int dp = AndroidUtilities.dp(36.0f);
                    for (int i10 = 0; i10 < niVar.f31048t0.size(); i10++) {
                        ((ph.n3) niVar.f31048t0.valueAt(i10)).setMeasureOffsetY(dp);
                    }
                    return;
                }
                niVar.f31049t1.setAlpha(0.0f);
                niVar.f31049t1.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
