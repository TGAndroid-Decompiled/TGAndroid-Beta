package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.ui.Cells.x7;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.yf0;
public final class v0 extends AnimatorListenerAdapter {
    public final int f21401a;
    public final float f21402b;
    public final Object f21403c;

    public v0(Object obj, float f7, int i10) {
        this.f21401a = i10;
        this.f21403c = obj;
        this.f21402b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f21401a;
        float f7 = this.f21402b;
        Object obj = this.f21403c;
        switch (i10) {
            case 0:
                y0 y0Var = (y0) obj;
                y0Var.T = null;
                y0Var.f21537a = f7;
                y0Var.invalidate();
                return;
            case 1:
                p3 p3Var = (p3) obj;
                p3Var.f20641i = f7;
                q3 q3Var = p3Var.f20637b;
                if (q3Var != null) {
                    q3Var.invalidate();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.q6 q6Var = (org.telegram.ui.Cells.q6) obj;
                q6Var.F = f7;
                q6Var.invalidate();
                return;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                x7 x7Var = (x7) obj;
                x7Var.f23592w = f7;
                colorMatrix.setSaturation(f7);
                if (t6.I.q()) {
                    org.telegram.messenger.i0.h(colorMatrix, (1.0f - x7Var.f23592w) * (-0.3f));
                }
                x7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                i9 i9Var = (i9) obj;
                i9Var.f26918g = f7;
                i9Var.invalidateSelf();
                return;
            case 5:
                yf0 yf0Var = (yf0) obj;
                yf0Var.H.e();
                yf0Var.f32719b = f7;
                if (f7 <= 0.0f) {
                    yf0Var.G = -1;
                }
                yf0Var.c(true);
                yf0Var.f32721f = false;
                if (yf0Var.P != null && Math.abs(f7 - 1.0f) < 0.01f) {
                    yf0Var.P.run();
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Wallet.p3 p3Var2 = (org.telegram.ui.Wallet.p3) obj;
                org.telegram.ui.Wallet.l6 l6Var = p3Var2.f35022r;
                l6Var.getClass();
                l6Var.setLayerType(0, null);
                if (f7 == 0.0f) {
                    p3Var2.b();
                    return;
                } else if (!p3Var2.R) {
                    ValueAnimator valueAnimator = p3Var2.P;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(p3Var2.Q, 1.0f);
                    p3Var2.P = ofFloat;
                    ofFloat.setDuration(320L);
                    p3Var2.P.setInterpolator(gr.f26496g);
                    p3Var2.P.addUpdateListener(new org.telegram.ui.Wallet.m3(p3Var2, 1));
                    p3Var2.P.start();
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.Wallet.b6 b6Var = (org.telegram.ui.Wallet.b6) obj;
                if (b6Var.m0 == animator) {
                    b6Var.m0 = null;
                    b6Var.L0(f7);
                    b6Var.f34257p0.o(false);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f21401a) {
            case 5:
                yf0 yf0Var = (yf0) this.f21403c;
                yf0Var.f32721f = true;
                yf0Var.f32720c = this.f21402b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
