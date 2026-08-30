package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class ih extends AnimatorListenerAdapter {
    public final int f25717a;
    public final boolean f25718b;
    public final rh f25719c;

    public ih(rh rhVar, boolean z4, int i10) {
        this.f25717a = i10;
        this.f25719c = rhVar;
        this.f25718b = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f25717a) {
            case 0:
                rh rhVar = this.f25719c;
                li liVar = rhVar.e;
                boolean z4 = this.f25718b;
                if (!z4) {
                    liVar.B1.setVisibility(8);
                } else {
                    liVar.f26746u1.setVisibility(8);
                }
                if (z4) {
                    i10 = AndroidUtilities.dp(36.0f);
                } else {
                    i10 = 0;
                }
                for (int i11 = 0; i11 < liVar.f26745u0.size(); i11++) {
                    ((rh.o3) liVar.f26745u0.valueAt(i11)).setMeasureOffsetY(i10);
                }
                if (rhVar.f28464a == animator) {
                    rhVar.f28464a = null;
                    return;
                }
                return;
            default:
                li liVar2 = this.f25719c.e;
                boolean z10 = this.f25718b;
                liVar2.f26761y1 = z10;
                if (!z10) {
                    liVar2.f26764z1.setVisibility(8);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f25717a) {
            case 0:
                li liVar = this.f25719c.e;
                if (this.f25718b) {
                    liVar.B1.setAlpha(0.0f);
                    liVar.B1.setVisibility(0);
                    int dp = AndroidUtilities.dp(36.0f);
                    for (int i10 = 0; i10 < liVar.f26745u0.size(); i10++) {
                        ((rh.o3) liVar.f26745u0.valueAt(i10)).setMeasureOffsetY(dp);
                    }
                    return;
                }
                liVar.f26746u1.setAlpha(0.0f);
                liVar.f26746u1.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
