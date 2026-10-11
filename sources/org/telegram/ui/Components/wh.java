package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class wh extends AnimatorListenerAdapter {
    public final int f32702a;
    public final boolean f32703b;
    public final ei f32704c;

    public wh(ei eiVar, boolean z10, int i10) {
        this.f32702a = i10;
        this.f32704c = eiVar;
        this.f32703b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f32702a) {
            case 0:
                ei eiVar = this.f32704c;
                yi yiVar = eiVar.f26099e;
                boolean z10 = this.f32703b;
                if (!z10) {
                    yiVar.H1.setVisibility(8);
                } else {
                    yiVar.A1.setVisibility(8);
                }
                if (z10) {
                    i10 = AndroidUtilities.dp(36.0f);
                } else {
                    i10 = 0;
                }
                for (int i11 = 0; i11 < yiVar.A0.size(); i11++) {
                    ((ei.p4) yiVar.A0.valueAt(i11)).setMeasureOffsetY(i10);
                }
                if (eiVar.f26096a == animator) {
                    eiVar.f26096a = null;
                    return;
                }
                return;
            default:
                yi yiVar2 = this.f32704c.f26099e;
                boolean z11 = this.f32703b;
                yiVar2.E1 = z11;
                if (!z11) {
                    yiVar2.F1.setVisibility(8);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f32702a) {
            case 0:
                yi yiVar = this.f32704c.f26099e;
                if (this.f32703b) {
                    yiVar.H1.setAlpha(0.0f);
                    yiVar.H1.setVisibility(0);
                    int dp = AndroidUtilities.dp(36.0f);
                    for (int i10 = 0; i10 < yiVar.A0.size(); i10++) {
                        ((ei.p4) yiVar.A0.valueAt(i10)).setMeasureOffsetY(dp);
                    }
                    return;
                }
                yiVar.A1.setAlpha(0.0f);
                yiVar.A1.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
