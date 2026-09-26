package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class uh extends AnimatorListenerAdapter {
    public final int f28812a;
    public final boolean f28813b;
    public final ci f28814c;

    public uh(ci ciVar, boolean z10, int i10) {
        this.f28812a = i10;
        this.f28814c = ciVar;
        this.f28813b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f28812a) {
            case 0:
                ci ciVar = this.f28814c;
                wi wiVar = ciVar.e;
                boolean z10 = this.f28813b;
                if (!z10) {
                    wiVar.E1.setVisibility(8);
                } else {
                    wiVar.f30078x1.setVisibility(8);
                }
                if (z10) {
                    i10 = AndroidUtilities.dp(36.0f);
                } else {
                    i10 = 0;
                }
                for (int i11 = 0; i11 < wiVar.f30077x0.size(); i11++) {
                    ((ei.q4) wiVar.f30077x0.valueAt(i11)).setMeasureOffsetY(i10);
                }
                if (ciVar.f23327a == animator) {
                    ciVar.f23327a = null;
                    return;
                }
                return;
            default:
                wi wiVar2 = this.f28814c.e;
                boolean z11 = this.f28813b;
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
        switch (this.f28812a) {
            case 0:
                wi wiVar = this.f28814c.e;
                if (this.f28813b) {
                    wiVar.E1.setAlpha(0.0f);
                    wiVar.E1.setVisibility(0);
                    int dp = AndroidUtilities.dp(36.0f);
                    for (int i10 = 0; i10 < wiVar.f30077x0.size(); i10++) {
                        ((ei.q4) wiVar.f30077x0.valueAt(i10)).setMeasureOffsetY(dp);
                    }
                    return;
                }
                wiVar.f30078x1.setAlpha(0.0f);
                wiVar.f30078x1.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
