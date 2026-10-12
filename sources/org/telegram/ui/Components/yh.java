package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class yh extends AnimatorListenerAdapter {
    public final int f33103a;
    public final boolean f33104b;
    public final gi f33105c;

    public yh(gi giVar, boolean z10, int i10) {
        this.f33103a = i10;
        this.f33105c = giVar;
        this.f33104b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f33103a) {
            case 0:
                gi giVar = this.f33105c;
                aj ajVar = giVar.f26437e;
                boolean z10 = this.f33104b;
                if (!z10) {
                    ajVar.H1.setVisibility(8);
                } else {
                    ajVar.A1.setVisibility(8);
                }
                if (z10) {
                    i10 = AndroidUtilities.dp(36.0f);
                } else {
                    i10 = 0;
                }
                for (int i11 = 0; i11 < ajVar.A0.size(); i11++) {
                    ((ei.p4) ajVar.A0.valueAt(i11)).setMeasureOffsetY(i10);
                }
                if (giVar.f26434a == animator) {
                    giVar.f26434a = null;
                    return;
                }
                return;
            default:
                aj ajVar2 = this.f33105c.f26437e;
                boolean z11 = this.f33104b;
                ajVar2.E1 = z11;
                if (!z11) {
                    ajVar2.F1.setVisibility(8);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f33103a) {
            case 0:
                aj ajVar = this.f33105c.f26437e;
                if (this.f33104b) {
                    ajVar.H1.setAlpha(0.0f);
                    ajVar.H1.setVisibility(0);
                    int dp = AndroidUtilities.dp(36.0f);
                    for (int i10 = 0; i10 < ajVar.A0.size(); i10++) {
                        ((ei.p4) ajVar.A0.valueAt(i10)).setMeasureOffsetY(dp);
                    }
                    return;
                }
                ajVar.A1.setAlpha(0.0f);
                ajVar.A1.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
