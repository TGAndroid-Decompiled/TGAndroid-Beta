package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.ve0;
import org.telegram.ui.Components.xq;
public final class t0 extends AnimatorListenerAdapter {
    public final int f28501a;
    public final float f28502b;
    public final Object f28503c;

    public t0(Object obj, float f10, int i7) {
        this.f28501a = i7;
        this.f28503c = obj;
        this.f28502b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.f28501a;
        float f10 = this.f28502b;
        Object obj = this.f28503c;
        switch (i7) {
            case 0:
                w0 w0Var = (w0) obj;
                w0Var.T = null;
                w0Var.f28681a = f10;
                w0Var.invalidate();
                return;
            case 1:
                j3 j3Var = (j3) obj;
                j3Var.f27619i = f10;
                k3 k3Var = j3Var.f27614b;
                if (k3Var != null) {
                    k3Var.invalidate();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) obj;
                m6Var.F = f10;
                m6Var.invalidate();
                return;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                t7 t7Var = (t7) obj;
                t7Var.f30536w = f10;
                colorMatrix.setSaturation(f10);
                if (k6.I.q()) {
                    org.telegram.messenger.g0.h(colorMatrix, (1.0f - t7Var.f30536w) * (-0.3f));
                }
                t7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                n9 n9Var = (n9) obj;
                n9Var.f36273g = f10;
                n9Var.invalidateSelf();
                return;
            case 5:
                ve0 ve0Var = (ve0) obj;
                ve0Var.H.e();
                ve0Var.f38988b = f10;
                if (f10 <= 0.0f) {
                    ve0Var.G = -1;
                }
                ve0Var.c(true);
                ve0Var.f38991f = false;
                if (ve0Var.P != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    ve0Var.P.run();
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Wallet.o3 o3Var = (org.telegram.ui.Wallet.o3) obj;
                org.telegram.ui.Wallet.g6 g6Var = o3Var.f42948r;
                g6Var.getClass();
                g6Var.setLayerType(0, null);
                if (f10 == 0.0f) {
                    o3Var.b();
                    return;
                } else if (!o3Var.R) {
                    ValueAnimator valueAnimator = o3Var.P;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(o3Var.Q, 1.0f);
                    o3Var.P = ofFloat;
                    ofFloat.setDuration(320L);
                    o3Var.P.setInterpolator(xq.f40367g);
                    o3Var.P.addUpdateListener(new org.telegram.ui.Wallet.l3(o3Var, 1));
                    o3Var.P.start();
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.Wallet.x5 x5Var = (org.telegram.ui.Wallet.x5) obj;
                if (x5Var.m0 == animator) {
                    x5Var.m0 = null;
                    x5Var.M0(f10);
                    x5Var.f43348p0.o(false);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28501a) {
            case 5:
                ve0 ve0Var = (ve0) this.f28503c;
                ve0Var.f38991f = true;
                ve0Var.f38989c = this.f28502b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
