package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.y7;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.th0;
import org.telegram.ui.Components.y9;
public final class y0 extends AnimatorListenerAdapter {
    public final int f21967a;
    public final float f21968b;
    public final Object f21969c;

    public y0(Object obj, float f7, int i10) {
        this.f21967a = i10;
        this.f21969c = obj;
        this.f21968b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f21967a;
        float f7 = this.f21968b;
        Object obj = this.f21969c;
        switch (i10) {
            case 0:
                b1 b1Var = (b1) obj;
                b1Var.T = null;
                b1Var.f20709a = f7;
                b1Var.invalidate();
                return;
            case 1:
                y3 y3Var = (y3) obj;
                y3Var.f21981i = f7;
                z3 z3Var = y3Var.f21977b;
                if (z3Var != null) {
                    z3Var.invalidate();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.o6 o6Var = (org.telegram.ui.Cells.o6) obj;
                o6Var.F = f7;
                o6Var.invalidate();
                return;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                y7 y7Var = (y7) obj;
                y7Var.v = f7;
                colorMatrix.setSaturation(f7);
                if (k6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - y7Var.v) * (-0.3f));
                }
                y7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                y9 y9Var = (y9) obj;
                y9Var.f32846g = f7;
                y9Var.invalidateSelf();
                return;
            case 5:
                th0 th0Var = (th0) obj;
                th0Var.H.unlock();
                th0Var.f30704b = f7;
                if (f7 <= 0.0f) {
                    th0Var.G = -1;
                }
                th0Var.c(true);
                th0Var.f30706f = false;
                if (th0Var.O != null && Math.abs(f7 - 1.0f) < 0.01f) {
                    th0Var.O.run();
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Wallet.y2 y2Var = (org.telegram.ui.Wallet.y2) obj;
                org.telegram.ui.Wallet.x5 x5Var = y2Var.f35436r;
                x5Var.getClass();
                x5Var.setLayerType(0, null);
                if (f7 == 0.0f) {
                    y2Var.b();
                    return;
                } else if (!y2Var.R) {
                    ValueAnimator valueAnimator = y2Var.P;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(y2Var.Q, 1.0f);
                    y2Var.P = ofFloat;
                    ofFloat.setDuration(320L);
                    y2Var.P.setInterpolator(bs.f25134g);
                    y2Var.P.addUpdateListener(new org.telegram.ui.Wallet.v2(y2Var, 1));
                    y2Var.P.start();
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.Wallet.o5 o5Var = (org.telegram.ui.Wallet.o5) obj;
                if (o5Var.f34945l0 == animator) {
                    o5Var.f34945l0 = null;
                    o5Var.H0(f7);
                    o5Var.f34948o0.o(false);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f21967a) {
            case 5:
                th0 th0Var = (th0) this.f21969c;
                th0Var.f30706f = true;
                th0Var.f30705c = this.f21968b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
