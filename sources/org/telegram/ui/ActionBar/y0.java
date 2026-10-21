package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.n6;
import org.telegram.ui.Cells.y7;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.y9;
public final class y0 extends AnimatorListenerAdapter {
    public final int f21896a;
    public final float f21897b;
    public final Object f21898c;

    public y0(Object obj, float f7, int i10) {
        this.f21896a = i10;
        this.f21898c = obj;
        this.f21897b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f21896a;
        float f7 = this.f21897b;
        Object obj = this.f21898c;
        switch (i10) {
            case 0:
                b1 b1Var = (b1) obj;
                b1Var.T = null;
                b1Var.f20638a = f7;
                b1Var.invalidate();
                return;
            case 1:
                v3 v3Var = (v3) obj;
                v3Var.f21791i = f7;
                w3 w3Var = v3Var.f21787b;
                if (w3Var != null) {
                    w3Var.invalidate();
                    return;
                }
                return;
            case 2:
                n6 n6Var = (n6) obj;
                n6Var.F = f7;
                n6Var.invalidate();
                return;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                y7 y7Var = (y7) obj;
                y7Var.v = f7;
                colorMatrix.setSaturation(f7);
                if (h6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - y7Var.v) * (-0.3f));
                }
                y7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                y9 y9Var = (y9) obj;
                y9Var.f32594g = f7;
                y9Var.invalidateSelf();
                return;
            case 5:
                qh0 qh0Var = (qh0) obj;
                qh0Var.H.unlock();
                qh0Var.f29592b = f7;
                if (f7 <= 0.0f) {
                    qh0Var.G = -1;
                }
                qh0Var.c(true);
                qh0Var.f29594f = false;
                if (qh0Var.O != null && Math.abs(f7 - 1.0f) < 0.01f) {
                    qh0Var.O.run();
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Wallet.z2 z2Var = (org.telegram.ui.Wallet.z2) obj;
                org.telegram.ui.Wallet.x5 x5Var = z2Var.f35174r;
                x5Var.getClass();
                x5Var.setLayerType(0, null);
                if (f7 == 0.0f) {
                    z2Var.b();
                    return;
                } else if (!z2Var.R) {
                    ValueAnimator valueAnimator = z2Var.P;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(z2Var.Q, 1.0f);
                    z2Var.P = ofFloat;
                    ofFloat.setDuration(320L);
                    z2Var.P.setInterpolator(bs.f25022g);
                    z2Var.P.addUpdateListener(new org.telegram.ui.Wallet.w2(z2Var, 1));
                    z2Var.P.start();
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.Wallet.o5 o5Var = (org.telegram.ui.Wallet.o5) obj;
                if (o5Var.f34654l0 == animator) {
                    o5Var.f34654l0 = null;
                    o5Var.H0(f7);
                    o5Var.f34657o0.o(false);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f21896a) {
            case 5:
                qh0 qh0Var = (qh0) this.f21898c;
                qh0Var.f29594f = true;
                qh0Var.f29593c = this.f21897b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
