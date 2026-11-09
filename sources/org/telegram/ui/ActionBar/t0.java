package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.we0;
import org.telegram.ui.Components.xq;
public final class t0 extends AnimatorListenerAdapter {
    public final int f28506a;
    public final float f28507b;
    public final Object f28508c;

    public t0(Object obj, float f10, int i7) {
        this.f28506a = i7;
        this.f28508c = obj;
        this.f28507b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.f28506a;
        float f10 = this.f28507b;
        Object obj = this.f28508c;
        switch (i7) {
            case 0:
                w0 w0Var = (w0) obj;
                w0Var.T = null;
                w0Var.f28683a = f10;
                w0Var.invalidate();
                return;
            case 1:
                j3 j3Var = (j3) obj;
                j3Var.f27606i = f10;
                k3 k3Var = j3Var.f27601b;
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
                t7Var.f30540w = f10;
                colorMatrix.setSaturation(f10);
                if (l6.I.q()) {
                    org.telegram.messenger.g0.h(colorMatrix, (1.0f - t7Var.f30540w) * (-0.3f));
                }
                t7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                n9 n9Var = (n9) obj;
                n9Var.f36297g = f10;
                n9Var.invalidateSelf();
                return;
            case 5:
                we0 we0Var = (we0) obj;
                we0Var.H.e();
                we0Var.f40040b = f10;
                if (f10 <= 0.0f) {
                    we0Var.G = -1;
                }
                we0Var.c(true);
                we0Var.f40043f = false;
                if (we0Var.P != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    we0Var.P.run();
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Wallet.n3 n3Var = (org.telegram.ui.Wallet.n3) obj;
                org.telegram.ui.Wallet.f6 f6Var = n3Var.f42866r;
                f6Var.getClass();
                f6Var.setLayerType(0, null);
                if (f10 == 0.0f) {
                    n3Var.b();
                    return;
                } else if (!n3Var.R) {
                    ValueAnimator valueAnimator = n3Var.P;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(n3Var.Q, 1.0f);
                    n3Var.P = ofFloat;
                    ofFloat.setDuration(320L);
                    n3Var.P.setInterpolator(xq.f40459g);
                    n3Var.P.addUpdateListener(new org.telegram.ui.Wallet.k3(n3Var, 1));
                    n3Var.P.start();
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) obj;
                if (w5Var.m0 == animator) {
                    w5Var.m0 = null;
                    w5Var.M0(f10);
                    w5Var.f43266p0.o(false);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28506a) {
            case 5:
                we0 we0Var = (we0) this.f28508c;
                we0Var.f40043f = true;
                we0Var.f40041c = this.f28507b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
