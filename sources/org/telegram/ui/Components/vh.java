package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class vh extends AnimatorListenerAdapter {
    public final int f31763a;
    public final boolean f31764b;
    public final ci f31765c;

    public vh(ci ciVar, boolean z10, int i10) {
        this.f31763a = i10;
        this.f31765c = ciVar;
        this.f31764b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f31763a) {
            case 0:
                ci ciVar = this.f31765c;
                xi xiVar = ciVar.f25433e;
                boolean z10 = this.f31764b;
                if (!z10) {
                    xiVar.E1.setVisibility(8);
                } else {
                    xiVar.f32968x1.setVisibility(8);
                }
                if (z10) {
                    i10 = AndroidUtilities.dp(36.0f);
                } else {
                    i10 = 0;
                }
                for (int i11 = 0; i11 < xiVar.f32967x0.size(); i11++) {
                    ((ei.r4) xiVar.f32967x0.valueAt(i11)).setMeasureOffsetY(i10);
                }
                if (ciVar.f25430a == animator) {
                    ciVar.f25430a = null;
                    return;
                }
                return;
            default:
                xi xiVar2 = this.f31765c.f25433e;
                boolean z11 = this.f31764b;
                xiVar2.B1 = z11;
                if (!z11) {
                    xiVar2.C1.setVisibility(8);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f31763a) {
            case 0:
                xi xiVar = this.f31765c.f25433e;
                if (this.f31764b) {
                    xiVar.E1.setAlpha(0.0f);
                    xiVar.E1.setVisibility(0);
                    int dp = AndroidUtilities.dp(36.0f);
                    for (int i10 = 0; i10 < xiVar.f32967x0.size(); i10++) {
                        ((ei.r4) xiVar.f32967x0.valueAt(i10)).setMeasureOffsetY(dp);
                    }
                    return;
                }
                xiVar.f32968x1.setAlpha(0.0f);
                xiVar.f32968x1.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
