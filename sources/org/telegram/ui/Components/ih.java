package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class ih extends AnimatorListenerAdapter {
    public final int f27816a;
    public final boolean f27817b;
    public final rh f27818c;

    public ih(rh rhVar, boolean z4, int i10) {
        this.f27816a = i10;
        this.f27818c = rhVar;
        this.f27817b = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f27816a) {
            case 0:
                rh rhVar = this.f27818c;
                mi miVar = rhVar.f30746e;
                boolean z4 = this.f27817b;
                if (!z4) {
                    miVar.B1.setVisibility(8);
                } else {
                    miVar.f29116u1.setVisibility(8);
                }
                if (z4) {
                    i10 = AndroidUtilities.dp(36.0f);
                } else {
                    i10 = 0;
                }
                for (int i11 = 0; i11 < miVar.f29115u0.size(); i11++) {
                    ((sh.n3) miVar.f29115u0.valueAt(i11)).setMeasureOffsetY(i10);
                }
                if (rhVar.f30743a == animator) {
                    rhVar.f30743a = null;
                    return;
                }
                return;
            default:
                mi miVar2 = this.f27818c.f30746e;
                boolean z10 = this.f27817b;
                miVar2.f29131y1 = z10;
                if (!z10) {
                    miVar2.f29134z1.setVisibility(8);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f27816a) {
            case 0:
                mi miVar = this.f27818c.f30746e;
                if (this.f27817b) {
                    miVar.B1.setAlpha(0.0f);
                    miVar.B1.setVisibility(0);
                    int dp = AndroidUtilities.dp(36.0f);
                    for (int i10 = 0; i10 < miVar.f29115u0.size(); i10++) {
                        ((sh.n3) miVar.f29115u0.valueAt(i10)).setMeasureOffsetY(dp);
                    }
                    return;
                }
                miVar.f29116u1.setAlpha(0.0f);
                miVar.f29116u1.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
