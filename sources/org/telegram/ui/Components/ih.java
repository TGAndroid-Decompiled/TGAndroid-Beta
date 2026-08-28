package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class ih extends AnimatorListenerAdapter {
    public final int f29442a;
    public final boolean f29443b;
    public final rh f29444c;

    public ih(rh rhVar, boolean z10, int i9) {
        this.f29442a = i9;
        this.f29444c = rhVar;
        this.f29443b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i9;
        switch (this.f29442a) {
            case 0:
                rh rhVar = this.f29444c;
                ki kiVar = rhVar.f32175e;
                boolean z10 = this.f29443b;
                if (!z10) {
                    kiVar.A1.setVisibility(8);
                } else {
                    kiVar.f30158t1.setVisibility(8);
                }
                if (z10) {
                    i9 = AndroidUtilities.dp(36.0f);
                } else {
                    i9 = 0;
                }
                for (int i10 = 0; i10 < kiVar.f30157t0.size(); i10++) {
                    ((mh.g4) kiVar.f30157t0.valueAt(i10)).setMeasureOffsetY(i9);
                }
                if (rhVar.f32172a == animator) {
                    rhVar.f32172a = null;
                    return;
                }
                return;
            default:
                ki kiVar2 = this.f29444c.f32175e;
                boolean z11 = this.f29443b;
                kiVar2.f30172x1 = z11;
                if (!z11) {
                    kiVar2.f30176y1.setVisibility(8);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f29442a) {
            case 0:
                ki kiVar = this.f29444c.f32175e;
                if (this.f29443b) {
                    kiVar.A1.setAlpha(0.0f);
                    kiVar.A1.setVisibility(0);
                    int dp = AndroidUtilities.dp(36.0f);
                    for (int i9 = 0; i9 < kiVar.f30157t0.size(); i9++) {
                        ((mh.g4) kiVar.f30157t0.valueAt(i9)).setMeasureOffsetY(dp);
                    }
                    return;
                }
                kiVar.f30158t1.setAlpha(0.0f);
                kiVar.f30158t1.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
