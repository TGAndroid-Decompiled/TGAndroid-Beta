package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class vh extends AnimatorListenerAdapter {
    public final int f31689a;
    public final boolean f31690b;
    public final ci f31691c;

    public vh(ci ciVar, boolean z10, int i10) {
        this.f31689a = i10;
        this.f31691c = ciVar;
        this.f31690b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f31689a) {
            case 0:
                ci ciVar = this.f31691c;
                xi xiVar = ciVar.f25379e;
                boolean z10 = this.f31690b;
                if (!z10) {
                    xiVar.E1.setVisibility(8);
                } else {
                    xiVar.f32870x1.setVisibility(8);
                }
                if (z10) {
                    i10 = AndroidUtilities.dp(36.0f);
                } else {
                    i10 = 0;
                }
                for (int i11 = 0; i11 < xiVar.f32869x0.size(); i11++) {
                    ((ei.r4) xiVar.f32869x0.valueAt(i11)).setMeasureOffsetY(i10);
                }
                if (ciVar.f25376a == animator) {
                    ciVar.f25376a = null;
                    return;
                }
                return;
            default:
                xi xiVar2 = this.f31691c.f25379e;
                boolean z11 = this.f31690b;
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
        switch (this.f31689a) {
            case 0:
                xi xiVar = this.f31691c.f25379e;
                if (this.f31690b) {
                    xiVar.E1.setAlpha(0.0f);
                    xiVar.E1.setVisibility(0);
                    int dp = AndroidUtilities.dp(36.0f);
                    for (int i10 = 0; i10 < xiVar.f32869x0.size(); i10++) {
                        ((ei.r4) xiVar.f32869x0.valueAt(i10)).setMeasureOffsetY(dp);
                    }
                    return;
                }
                xiVar.f32870x1.setAlpha(0.0f);
                xiVar.f32870x1.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
