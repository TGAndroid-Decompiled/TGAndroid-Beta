package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class vh extends AnimatorListenerAdapter {
    public final int f29120a;
    public final boolean f29121b;
    public final di f29122c;

    public vh(di diVar, boolean z10, int i10) {
        this.f29120a = i10;
        this.f29122c = diVar;
        this.f29121b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f29120a) {
            case 0:
                di diVar = this.f29122c;
                xi xiVar = diVar.e;
                boolean z10 = this.f29121b;
                if (!z10) {
                    xiVar.E1.setVisibility(8);
                } else {
                    xiVar.f30328x1.setVisibility(8);
                }
                if (z10) {
                    i10 = AndroidUtilities.dp(36.0f);
                } else {
                    i10 = 0;
                }
                for (int i11 = 0; i11 < xiVar.f30327x0.size(); i11++) {
                    ((ei.q4) xiVar.f30327x0.valueAt(i11)).setMeasureOffsetY(i10);
                }
                if (diVar.f23648a == animator) {
                    diVar.f23648a = null;
                    return;
                }
                return;
            default:
                xi xiVar2 = this.f29122c.e;
                boolean z11 = this.f29121b;
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
        switch (this.f29120a) {
            case 0:
                xi xiVar = this.f29122c.e;
                if (this.f29121b) {
                    xiVar.E1.setAlpha(0.0f);
                    xiVar.E1.setVisibility(0);
                    int dp = AndroidUtilities.dp(36.0f);
                    for (int i10 = 0; i10 < xiVar.f30327x0.size(); i10++) {
                        ((ei.q4) xiVar.f30327x0.valueAt(i10)).setMeasureOffsetY(dp);
                    }
                    return;
                }
                xiVar.f30328x1.setAlpha(0.0f);
                xiVar.f30328x1.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
