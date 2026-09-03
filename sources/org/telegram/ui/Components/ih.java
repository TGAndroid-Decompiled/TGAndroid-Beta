package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class ih extends AnimatorListenerAdapter {
    public final int f25706a;
    public final boolean f25707b;
    public final rh f25708c;

    public ih(rh rhVar, boolean z4, int i10) {
        this.f25706a = i10;
        this.f25708c = rhVar;
        this.f25707b = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f25706a) {
            case 0:
                rh rhVar = this.f25708c;
                li liVar = rhVar.e;
                boolean z4 = this.f25707b;
                if (!z4) {
                    liVar.B1.setVisibility(8);
                } else {
                    liVar.f26742u1.setVisibility(8);
                }
                if (z4) {
                    i10 = AndroidUtilities.dp(36.0f);
                } else {
                    i10 = 0;
                }
                for (int i11 = 0; i11 < liVar.f26741u0.size(); i11++) {
                    ((rh.n3) liVar.f26741u0.valueAt(i11)).setMeasureOffsetY(i10);
                }
                if (rhVar.f28471a == animator) {
                    rhVar.f28471a = null;
                    return;
                }
                return;
            default:
                li liVar2 = this.f25708c.e;
                boolean z10 = this.f25707b;
                liVar2.f26757y1 = z10;
                if (!z10) {
                    liVar2.f26760z1.setVisibility(8);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f25706a) {
            case 0:
                li liVar = this.f25708c.e;
                if (this.f25707b) {
                    liVar.B1.setAlpha(0.0f);
                    liVar.B1.setVisibility(0);
                    int dp = AndroidUtilities.dp(36.0f);
                    for (int i10 = 0; i10 < liVar.f26741u0.size(); i10++) {
                        ((rh.n3) liVar.f26741u0.valueAt(i10)).setMeasureOffsetY(dp);
                    }
                    return;
                }
                liVar.f26742u1.setAlpha(0.0f);
                liVar.f26742u1.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
