package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
public final class lc implements ValueAnimator.AnimatorUpdateListener {
    public final int f36057a;
    public boolean f36058b = false;
    public final NotificationCenter.NotificationCenterDelegate f36059c;

    public lc(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f36057a = i10;
        this.f36059c = notificationCenterDelegate;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36057a) {
            case 0:
                bd bdVar = (bd) this.f36059c;
                bdVar.f32924k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bdVar.f32923j0.invalidate();
                if (!this.f36058b && bdVar.f32924k0 > 0.5f) {
                    this.f36058b = true;
                    return;
                }
                return;
            case 1:
                gp0 gp0Var = (gp0) this.f36059c;
                gp0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gp0Var.L.invalidate();
                if (!this.f36058b && gp0Var.M > 0.5f) {
                    this.f36058b = true;
                    return;
                }
                return;
            case 2:
                cd1 cd1Var = (cd1) this.f36059c;
                cd1Var.f33307f2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cd1Var.f33303e2.invalidate();
                if (!this.f36058b && cd1Var.f33307f2 > 0.5f) {
                    this.f36058b = true;
                    return;
                }
                return;
            default:
                ph.da daVar = (ph.da) this.f36059c;
                daVar.A2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.uo uoVar = daVar.f41556z2;
                if (uoVar != null) {
                    uoVar.invalidate();
                }
                if (!this.f36058b && daVar.A2 > 0.5f) {
                    this.f36058b = true;
                    return;
                }
                return;
        }
    }
}
