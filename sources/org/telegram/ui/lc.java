package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
public final class lc implements ValueAnimator.AnimatorUpdateListener {
    public final int f38701a;
    public boolean f38702b = false;
    public final NotificationCenter.NotificationCenterDelegate f38703c;

    public lc(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f38701a = i10;
        this.f38703c = notificationCenterDelegate;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38701a) {
            case 0:
                bd bdVar = (bd) this.f38703c;
                bdVar.f35435k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bdVar.f35434j0.invalidate();
                if (!this.f38702b && bdVar.f35435k0 > 0.5f) {
                    this.f38702b = true;
                    return;
                }
                return;
            case 1:
                ip0 ip0Var = (ip0) this.f38703c;
                ip0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ip0Var.L.invalidate();
                if (!this.f38702b && ip0Var.M > 0.5f) {
                    this.f38702b = true;
                    return;
                }
                return;
            case 2:
                ed1 ed1Var = (ed1) this.f38703c;
                ed1Var.f36507f2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ed1Var.f36503e2.invalidate();
                if (!this.f38702b && ed1Var.f36507f2 > 0.5f) {
                    this.f38702b = true;
                    return;
                }
                return;
            default:
                qh.ca caVar = (qh.ca) this.f38703c;
                caVar.A2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.wo woVar = caVar.f45159z2;
                if (woVar != null) {
                    woVar.invalidate();
                }
                if (!this.f38702b && caVar.A2 > 0.5f) {
                    this.f38702b = true;
                    return;
                }
                return;
        }
    }
}
