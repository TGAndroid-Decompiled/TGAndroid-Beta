package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class uh extends AnimatorListenerAdapter {
    public final int f28792a;
    public final boolean f28793b;
    public final ci f28794c;

    public uh(ci ciVar, boolean z10, int i10) {
        this.f28792a = i10;
        this.f28794c = ciVar;
        this.f28793b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f28792a) {
            case 0:
                ci ciVar = this.f28794c;
                wi wiVar = ciVar.e;
                boolean z10 = this.f28793b;
                if (!z10) {
                    wiVar.E1.setVisibility(8);
                } else {
                    wiVar.f30063x1.setVisibility(8);
                }
                if (z10) {
                    i10 = AndroidUtilities.dp(36.0f);
                } else {
                    i10 = 0;
                }
                for (int i11 = 0; i11 < wiVar.f30062x0.size(); i11++) {
                    ((ei.q4) wiVar.f30062x0.valueAt(i11)).setMeasureOffsetY(i10);
                }
                if (ciVar.f23343a == animator) {
                    ciVar.f23343a = null;
                    return;
                }
                return;
            default:
                wi wiVar2 = this.f28794c.e;
                boolean z11 = this.f28793b;
                wiVar2.B1 = z11;
                if (!z11) {
                    wiVar2.C1.setVisibility(8);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28792a) {
            case 0:
                wi wiVar = this.f28794c.e;
                if (this.f28793b) {
                    wiVar.E1.setAlpha(0.0f);
                    wiVar.E1.setVisibility(0);
                    int dp = AndroidUtilities.dp(36.0f);
                    for (int i10 = 0; i10 < wiVar.f30062x0.size(); i10++) {
                        ((ei.q4) wiVar.f30062x0.valueAt(i10)).setMeasureOffsetY(dp);
                    }
                    return;
                }
                wiVar.f30063x1.setAlpha(0.0f);
                wiVar.f30063x1.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
