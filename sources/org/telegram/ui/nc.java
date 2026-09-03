package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
public final class nc implements ValueAnimator.AnimatorUpdateListener {
    public final int f36476a;
    public boolean f36477b = false;
    public final NotificationCenter.NotificationCenterDelegate f36478c;

    public nc(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f36476a = i10;
        this.f36478c = notificationCenterDelegate;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36476a) {
            case 0:
                dd ddVar = (dd) this.f36478c;
                ddVar.f33430k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ddVar.f33429j0.invalidate();
                if (!this.f36477b && ddVar.f33430k0 > 0.5f) {
                    this.f36477b = true;
                    return;
                }
                return;
            case 1:
                np0 np0Var = (np0) this.f36478c;
                np0Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                np0Var.U.invalidate();
                if (!this.f36477b && np0Var.V > 0.5f) {
                    this.f36477b = true;
                    return;
                }
                return;
            case 2:
                jd1 jd1Var = (jd1) this.f36478c;
                jd1Var.f35199f2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jd1Var.f35195e2.invalidate();
                if (!this.f36477b && jd1Var.f35199f2 > 0.5f) {
                    this.f36477b = true;
                    return;
                }
                return;
            default:
                ph.da daVar = (ph.da) this.f36478c;
                daVar.A2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.to toVar = daVar.f41594z2;
                if (toVar != null) {
                    toVar.invalidate();
                }
                if (!this.f36477b && daVar.A2 > 0.5f) {
                    this.f36477b = true;
                    return;
                }
                return;
        }
    }
}
