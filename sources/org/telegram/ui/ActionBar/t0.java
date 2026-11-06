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
    public final int f28497a;
    public final float f28498b;
    public final Object f28499c;

    public t0(Object obj, float f10, int i7) {
        this.f28497a = i7;
        this.f28499c = obj;
        this.f28498b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.f28497a;
        float f10 = this.f28498b;
        Object obj = this.f28499c;
        switch (i7) {
            case 0:
                w0 w0Var = (w0) obj;
                w0Var.T = null;
                w0Var.f28677a = f10;
                w0Var.invalidate();
                return;
            case 1:
                j3 j3Var = (j3) obj;
                j3Var.f27615i = f10;
                k3 k3Var = j3Var.f27610b;
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
                t7Var.f30531w = f10;
                colorMatrix.setSaturation(f10);
                if (k6.I.q()) {
                    org.telegram.messenger.g0.h(colorMatrix, (1.0f - t7Var.f30531w) * (-0.3f));
                }
                t7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                n9 n9Var = (n9) obj;
                n9Var.f36324g = f10;
                n9Var.invalidateSelf();
                return;
            case 5:
                ve0 ve0Var = (ve0) obj;
                ve0Var.H.e();
                ve0Var.f38935b = f10;
                if (f10 <= 0.0f) {
                    ve0Var.G = -1;
                }
                ve0Var.c(true);
                ve0Var.f38938f = false;
                if (ve0Var.P != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    ve0Var.P.run();
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Wallet.p3 p3Var = (org.telegram.ui.Wallet.p3) obj;
                org.telegram.ui.Wallet.h6 h6Var = p3Var.f42962r;
                h6Var.getClass();
                h6Var.setLayerType(0, null);
                if (f10 == 0.0f) {
                    p3Var.b();
                    return;
                } else if (!p3Var.R) {
                    ValueAnimator valueAnimator = p3Var.P;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(p3Var.Q, 1.0f);
                    p3Var.P = ofFloat;
                    ofFloat.setDuration(320L);
                    p3Var.P.setInterpolator(xq.f40311g);
                    p3Var.P.addUpdateListener(new org.telegram.ui.Wallet.m3(p3Var, 1));
                    p3Var.P.start();
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) obj;
                if (y5Var.m0 == animator) {
                    y5Var.m0 = null;
                    y5Var.M0(f10);
                    y5Var.f43358p0.o(false);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28497a) {
            case 5:
                ve0 ve0Var = (ve0) this.f28499c;
                ve0Var.f38938f = true;
                ve0Var.f38936c = this.f28498b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
