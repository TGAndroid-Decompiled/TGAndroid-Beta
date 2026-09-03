package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
public final class kc implements ValueAnimator.AnimatorUpdateListener {
    public final int f38247a;
    public boolean f38248b = false;
    public final NotificationCenter.NotificationCenterDelegate f38249c;

    public kc(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f38247a = i10;
        this.f38249c = notificationCenterDelegate;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38247a) {
            case 0:
                bd bdVar = (bd) this.f38249c;
                bdVar.f35451k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bdVar.f35450j0.invalidate();
                if (!this.f38248b && bdVar.f35451k0 > 0.5f) {
                    this.f38248b = true;
                    return;
                }
                return;
            case 1:
                np0 np0Var = (np0) this.f38249c;
                np0Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                np0Var.U.invalidate();
                if (!this.f38248b && np0Var.V > 0.5f) {
                    this.f38248b = true;
                    return;
                }
                return;
            case 2:
                jd1 jd1Var = (jd1) this.f38249c;
                jd1Var.f37982f2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jd1Var.f37978e2.invalidate();
                if (!this.f38248b && jd1Var.f37982f2 > 0.5f) {
                    this.f38248b = true;
                    return;
                }
                return;
            default:
                qh.ba baVar = (qh.ba) this.f38249c;
                baVar.A2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.wo woVar = baVar.f45125z2;
                if (woVar != null) {
                    woVar.invalidate();
                }
                if (!this.f38248b && baVar.A2 > 0.5f) {
                    this.f38248b = true;
                    return;
                }
                return;
        }
    }
}
