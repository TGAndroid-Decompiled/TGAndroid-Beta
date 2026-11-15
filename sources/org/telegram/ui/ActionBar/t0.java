package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.ye0;
public final class t0 extends AnimatorListenerAdapter {
    public final int f29610a;
    public final float f29611b;
    public final Object f29612c;

    public t0(Object obj, float f10, int i7) {
        this.f29610a = i7;
        this.f29612c = obj;
        this.f29611b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.f29610a;
        float f10 = this.f29611b;
        Object obj = this.f29612c;
        switch (i7) {
            case 0:
                w0 w0Var = (w0) obj;
                w0Var.U = null;
                w0Var.f29775a = f10;
                w0Var.invalidate();
                return;
            case 1:
                i3 i3Var = (i3) obj;
                i3Var.f28672i = f10;
                j3 j3Var = i3Var.f28667b;
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
                s7Var.f31426w = f10;
                colorMatrix.setSaturation(f10);
                if (j6.I.q()) {
                    org.telegram.messenger.g0.h(colorMatrix, (1.0f - s7Var.f31426w) * (-0.3f));
                }
                s7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                k9 k9Var = (k9) obj;
                k9Var.f36328g = f10;
                k9Var.invalidateSelf();
                return;
            case 5:
                ye0 ye0Var = (ye0) obj;
                ye0Var.I.e();
                ye0Var.f41982b = f10;
                if (f10 <= 0.0f) {
                    ye0Var.H = -1;
                }
                ye0Var.c(true);
                ye0Var.f41985f = false;
                if (ye0Var.Q != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    ye0Var.Q.run();
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Wallet.o3 o3Var = (org.telegram.ui.Wallet.o3) obj;
                org.telegram.ui.Wallet.h6 h6Var = o3Var.f44229r;
                h6Var.getClass();
                h6Var.setLayerType(0, null);
                if (f10 == 0.0f) {
                    o3Var.b();
                    return;
                } else if (!o3Var.S) {
                    ValueAnimator valueAnimator = o3Var.Q;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(o3Var.R, 1.0f);
                    o3Var.Q = ofFloat;
                    ofFloat.setDuration(320L);
                    o3Var.Q.setInterpolator(er.f34420g);
                    o3Var.Q.addUpdateListener(new org.telegram.ui.Wallet.h3(o3Var, 0));
                    o3Var.Q.start();
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) obj;
                if (y5Var.f44742n0 == animator) {
                    y5Var.f44742n0 = null;
                    y5Var.N0(f10);
                    y5Var.f44745q0.k(false);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f29610a) {
            case 5:
                ye0 ye0Var = (ye0) this.f29612c;
                ye0Var.f41985f = true;
                ye0Var.f41983c = this.f29611b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
