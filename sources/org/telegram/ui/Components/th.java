package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class th extends AnimatorListenerAdapter {
    public final int f30601a;
    public final boolean f30602b;
    public final bi f30603c;

    public th(bi biVar, boolean z10, int i10) {
        this.f30601a = i10;
        this.f30603c = biVar;
        this.f30602b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f30601a) {
            case 0:
                bi biVar = this.f30603c;
                vi viVar = biVar.f24715e;
                boolean z10 = this.f30602b;
                if (!z10) {
                    viVar.E1.setVisibility(8);
                } else {
                    viVar.f31338x1.setVisibility(8);
                }
                if (z10) {
                    i10 = AndroidUtilities.dp(36.0f);
                } else {
                    i10 = 0;
                }
                for (int i11 = 0; i11 < viVar.f31337x0.size(); i11++) {
                    ((fi.r4) viVar.f31337x0.valueAt(i11)).setMeasureOffsetY(i10);
                }
                if (biVar.f24712a == animator) {
                    biVar.f24712a = null;
                    return;
                }
                return;
            default:
                vi viVar2 = this.f30603c.f24715e;
                boolean z11 = this.f30602b;
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
        switch (this.f30601a) {
            case 0:
                vi viVar = this.f30603c.f24715e;
                if (this.f30602b) {
                    viVar.E1.setAlpha(0.0f);
                    viVar.E1.setVisibility(0);
                    int dp = AndroidUtilities.dp(36.0f);
                    for (int i10 = 0; i10 < viVar.f31337x0.size(); i10++) {
                        ((fi.r4) viVar.f31337x0.valueAt(i10)).setMeasureOffsetY(dp);
                    }
                    return;
                }
                viVar.f31338x1.setAlpha(0.0f);
                viVar.f31338x1.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
