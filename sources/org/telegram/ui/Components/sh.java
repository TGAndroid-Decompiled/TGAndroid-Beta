package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class sh extends AnimatorListenerAdapter {
    public final int f32555a;
    public final boolean f32556b;
    public final zh f32557c;

    public sh(zh zhVar, boolean z10, int i10) {
        this.f32555a = i10;
        this.f32557c = zhVar;
        this.f32556b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f32555a) {
            case 0:
                zh zhVar = this.f32557c;
                ti tiVar = zhVar.e;
                boolean z10 = this.f32556b;
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
                    ((hi.o4) tiVar.A0.valueAt(i11)).setMeasureOffsetY(i10);
                }
                if (zhVar.f35329a == animator) {
                    zhVar.f35329a = null;
                    return;
                }
                return;
            default:
                ti tiVar2 = this.f32557c.e;
                boolean z11 = this.f32556b;
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
        switch (this.f32555a) {
            case 0:
                ti tiVar = this.f32557c.e;
                if (this.f32556b) {
                    tiVar.H1.setAlpha(0.0f);
                    tiVar.H1.setVisibility(0);
                    int dp = AndroidUtilities.dp(36.0f);
                    for (int i10 = 0; i10 < tiVar.A0.size(); i10++) {
                        ((hi.o4) tiVar.A0.valueAt(i10)).setMeasureOffsetY(dp);
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
