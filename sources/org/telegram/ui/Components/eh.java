package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

public final class eh extends AnimatorListenerAdapter {

    public final int f28054a;

    public final boolean f28055b;

    public final nh f28056c;

    public eh(nh nhVar, boolean z10, int i10) {
        this.f28054a = i10;
        this.f28056c = nhVar;
        this.f28055b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28054a) {
            case 0:
                nh nhVar = this.f28056c;
                gi giVar = nhVar.f30972e;
                boolean z10 = this.f28055b;
                if (z10) {
                    giVar.f28694t1.setVisibility(8);
                } else {
                    giVar.A1.setVisibility(8);
                }
                int iDp = z10 ? AndroidUtilities.dp(36.0f) : 0;
                for (int i10 = 0; i10 < giVar.f28693t0.size(); i10++) {
                    ((nh.e4) giVar.f28693t0.valueAt(i10)).setMeasureOffsetY(iDp);
                }
                if (nhVar.f30969a == animator) {
                    nhVar.f30969a = null;
                }
                break;
            default:
                gi giVar2 = this.f28056c.f30972e;
                boolean z11 = this.f28055b;
                giVar2.f28708x1 = z11;
                if (!z11) {
                    giVar2.f28712y1.setVisibility(8);
                }
                break;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28054a) {
            case 0:
                gi giVar = this.f28056c.f30972e;
                if (this.f28055b) {
                    giVar.A1.setAlpha(0.0f);
                    giVar.A1.setVisibility(0);
                    int iDp = AndroidUtilities.dp(36.0f);
                    for (int i10 = 0; i10 < giVar.f28693t0.size(); i10++) {
                        ((nh.e4) giVar.f28693t0.valueAt(i10)).setMeasureOffsetY(iDp);
                    }
                } else {
                    giVar.f28694t1.setAlpha(0.0f);
                    giVar.f28694t1.setVisibility(0);
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
