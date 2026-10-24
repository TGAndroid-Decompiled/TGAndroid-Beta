package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class qh extends AnimatorListenerAdapter {
    public final int f29927a;
    public final boolean f29928b;
    public final yh f29929c;

    public qh(yh yhVar, boolean z10, int i10) {
        this.f29927a = i10;
        this.f29929c = yhVar;
        this.f29928b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f29927a) {
            case 0:
                yh yhVar = this.f29929c;
                ri riVar = yhVar.e;
                boolean z10 = this.f29928b;
                if (!z10) {
                    riVar.H1.setVisibility(8);
                } else {
                    riVar.A1.setVisibility(8);
                }
                if (z10) {
                    i10 = AndroidUtilities.dp(36.0f);
                } else {
                    i10 = 0;
                }
                for (int i11 = 0; i11 < riVar.A0.size(); i11++) {
                    ((gi.f4) riVar.A0.valueAt(i11)).setMeasureOffsetY(i10);
                }
                if (yhVar.f32913a == animator) {
                    yhVar.f32913a = null;
                    return;
                }
                return;
            default:
                ri riVar2 = this.f29929c.e;
                boolean z11 = this.f29928b;
                riVar2.E1 = z11;
                if (!z11) {
                    riVar2.F1.setVisibility(8);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f29927a) {
            case 0:
                ri riVar = this.f29929c.e;
                if (this.f29928b) {
                    riVar.H1.setAlpha(0.0f);
                    riVar.H1.setVisibility(0);
                    int dp = AndroidUtilities.dp(36.0f);
                    for (int i10 = 0; i10 < riVar.A0.size(); i10++) {
                        ((gi.f4) riVar.A0.valueAt(i10)).setMeasureOffsetY(dp);
                    }
                    return;
                }
                riVar.A1.setAlpha(0.0f);
                riVar.A1.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
