package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class sh extends AnimatorListenerAdapter {
    public final int f30288a;
    public final boolean f30289b;
    public final ai f30290c;

    public sh(ai aiVar, boolean z10, int i10) {
        this.f30288a = i10;
        this.f30290c = aiVar;
        this.f30289b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f30288a) {
            case 0:
                ai aiVar = this.f30290c;
                ti tiVar = aiVar.e;
                boolean z10 = this.f30289b;
                if (!z10) {
                    tiVar.H1.setVisibility(8);
                } else {
                    tiVar.A1.setVisibility(8);
                }
                if (z10) {
                    i10 = AndroidUtilities.dp(36.0f);
                } else {
                    i10 = 0;
                }
                for (int i11 = 0; i11 < tiVar.A0.size(); i11++) {
                    ((gi.f4) tiVar.A0.valueAt(i11)).setMeasureOffsetY(i10);
                }
                if (aiVar.f24624a == animator) {
                    aiVar.f24624a = null;
                    return;
                }
                return;
            default:
                ti tiVar2 = this.f30290c.e;
                boolean z11 = this.f30289b;
                tiVar2.E1 = z11;
                if (!z11) {
                    tiVar2.F1.setVisibility(8);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f30288a) {
            case 0:
                ti tiVar = this.f30290c.e;
                if (this.f30289b) {
                    tiVar.H1.setAlpha(0.0f);
                    tiVar.H1.setVisibility(0);
                    int dp = AndroidUtilities.dp(36.0f);
                    for (int i10 = 0; i10 < tiVar.A0.size(); i10++) {
                        ((gi.f4) tiVar.A0.valueAt(i10)).setMeasureOffsetY(dp);
                    }
                    return;
                }
                tiVar.A1.setAlpha(0.0f);
                tiVar.A1.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
