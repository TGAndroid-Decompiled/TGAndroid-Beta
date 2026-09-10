package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class wh extends AnimatorListenerAdapter {
    public final int f28772a;
    public final boolean f28773b;
    public final ei f28774c;

    public wh(ei eiVar, boolean z10, int i10) {
        this.f28772a = i10;
        this.f28774c = eiVar;
        this.f28773b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f28772a) {
            case 0:
                ei eiVar = this.f28774c;
                yi yiVar = eiVar.e;
                boolean z10 = this.f28773b;
                if (!z10) {
                    yiVar.E1.setVisibility(8);
                } else {
                    yiVar.f29424x1.setVisibility(8);
                }
                if (z10) {
                    i10 = AndroidUtilities.dp(36.0f);
                } else {
                    i10 = 0;
                }
                for (int i11 = 0; i11 < yiVar.f29423x0.size(); i11++) {
                    ((di.u4) yiVar.f29423x0.valueAt(i11)).setMeasureOffsetY(i10);
                }
                if (eiVar.f22712a == animator) {
                    eiVar.f22712a = null;
                    return;
                }
                return;
            default:
                yi yiVar2 = this.f28774c.e;
                boolean z11 = this.f28773b;
                yiVar2.B1 = z11;
                if (!z11) {
                    yiVar2.C1.setVisibility(8);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28772a) {
            case 0:
                yi yiVar = this.f28774c.e;
                if (this.f28773b) {
                    yiVar.E1.setAlpha(0.0f);
                    yiVar.E1.setVisibility(0);
                    int dp = AndroidUtilities.dp(36.0f);
                    for (int i10 = 0; i10 < yiVar.f29423x0.size(); i10++) {
                        ((di.u4) yiVar.f29423x0.valueAt(i10)).setMeasureOffsetY(dp);
                    }
                    return;
                }
                yiVar.f29424x1.setAlpha(0.0f);
                yiVar.f29424x1.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
