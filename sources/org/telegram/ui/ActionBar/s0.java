package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Components.m9;
import org.telegram.ui.Components.xe0;
import org.telegram.ui.Components.xq;
public final class s0 extends AnimatorListenerAdapter {
    public final int f28520a;
    public final float f28521b;
    public final Object f28522c;

    public s0(Object obj, float f10, int i3) {
        this.f28520a = i3;
        this.f28522c = obj;
        this.f28521b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i3 = this.f28520a;
        float f10 = this.f28521b;
        Object obj = this.f28522c;
        switch (i3) {
            case 0:
                v0 v0Var = (v0) obj;
                v0Var.U = null;
                v0Var.f28712a = f10;
                v0Var.invalidate();
                return;
            case 1:
                i3 i3Var = (i3) obj;
                i3Var.f27598i = f10;
                j3 j3Var = i3Var.f27593b;
                if (j3Var != null) {
                    j3Var.invalidate();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.l6 l6Var = (org.telegram.ui.Cells.l6) obj;
                l6Var.G = f10;
                l6Var.invalidate();
                return;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                s7 s7Var = (s7) obj;
                s7Var.f30350w = f10;
                colorMatrix.setSaturation(f10);
                if (k6.I.q()) {
                    org.telegram.messenger.g0.h(colorMatrix, (1.0f - s7Var.f30350w) * (-0.3f));
                }
                s7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                m9 m9Var = (m9) obj;
                m9Var.f36097g = f10;
                m9Var.invalidateSelf();
                return;
            case 5:
                xe0 xe0Var = (xe0) obj;
                xe0Var.I.e();
                xe0Var.f40329b = f10;
                if (f10 <= 0.0f) {
                    xe0Var.H = -1;
                }
                xe0Var.c(true);
                xe0Var.f40332f = false;
                if (xe0Var.Q != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    xe0Var.Q.run();
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Wallet.n3 n3Var = (org.telegram.ui.Wallet.n3) obj;
                org.telegram.ui.Wallet.f6 f6Var = n3Var.f42919r;
                f6Var.getClass();
                f6Var.setLayerType(0, null);
                if (f10 == 0.0f) {
                    n3Var.b();
                    return;
                } else if (!n3Var.S) {
                    ValueAnimator valueAnimator = n3Var.Q;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(n3Var.R, 1.0f);
                    n3Var.Q = ofFloat;
                    ofFloat.setDuration(320L);
                    n3Var.Q.setInterpolator(xq.f40453g);
                    n3Var.Q.addUpdateListener(new org.telegram.ui.Wallet.k3(n3Var, 1));
                    n3Var.Q.start();
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) obj;
                if (w5Var.f43334n0 == animator) {
                    w5Var.f43334n0 = null;
                    w5Var.M0(f10);
                    w5Var.f43337q0.k(false);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28520a) {
            case 5:
                xe0 xe0Var = (xe0) this.f28522c;
                xe0Var.f40332f = true;
                xe0Var.f40330c = this.f28521b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
