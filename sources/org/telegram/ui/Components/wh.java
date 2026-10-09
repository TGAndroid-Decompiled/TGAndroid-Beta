package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class wh extends AnimatorListenerAdapter {
    public final int f32620a;
    public final boolean f32621b;
    public final ei f32622c;

    public wh(ei eiVar, boolean z10, int i10) {
        this.f32620a = i10;
        this.f32622c = eiVar;
        this.f32621b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f32620a) {
            case 0:
                ei eiVar = this.f32622c;
                yi yiVar = eiVar.f26093e;
                boolean z10 = this.f32621b;
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
                if (eiVar.f26090a == animator) {
                    eiVar.f26090a = null;
                    return;
                }
                return;
            default:
                yi yiVar2 = this.f32622c.f26093e;
                boolean z11 = this.f32621b;
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
        switch (this.f32620a) {
            case 0:
                yi yiVar = this.f32622c.f26093e;
                if (this.f32621b) {
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
