package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Components.m9;
import org.telegram.ui.Components.ve0;
import org.telegram.ui.Components.wq;
public final class t0 extends AnimatorListenerAdapter {
    public final int f28511a;
    public final float f28512b;
    public final Object f28513c;

    public t0(Object obj, float f10, int i7) {
        this.f28511a = i7;
        this.f28513c = obj;
        this.f28512b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.f28511a;
        float f10 = this.f28512b;
        Object obj = this.f28513c;
        switch (i7) {
            case 0:
                w0 w0Var = (w0) obj;
                w0Var.T = null;
                w0Var.f28651a = f10;
                w0Var.invalidate();
                return;
            case 1:
                k3 k3Var = (k3) obj;
                k3Var.f27644i = f10;
                l3 l3Var = k3Var.f27639b;
                if (l3Var != null) {
                    l3Var.invalidate();
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
                t7Var.f30551w = f10;
                colorMatrix.setSaturation(f10);
                if (m6.I.q()) {
                    org.telegram.messenger.g0.h(colorMatrix, (1.0f - t7Var.f30551w) * (-0.3f));
                }
                t7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                m9 m9Var = (m9) obj;
                m9Var.f35897g = f10;
                m9Var.invalidateSelf();
                return;
            case 5:
                ve0 ve0Var = (ve0) obj;
                ve0Var.H.e();
                ve0Var.f38991b = f10;
                if (f10 <= 0.0f) {
                    ve0Var.G = -1;
                }
                ve0Var.c(true);
                ve0Var.f38994f = false;
                if (ve0Var.P != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    ve0Var.P.run();
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Wallet.p3 p3Var = (org.telegram.ui.Wallet.p3) obj;
                org.telegram.ui.Wallet.i6 i6Var = p3Var.f42971r;
                i6Var.getClass();
                i6Var.setLayerType(0, null);
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
                    p3Var.P.setInterpolator(wq.f40047g);
                    p3Var.P.addUpdateListener(new org.telegram.ui.Wallet.i3(p3Var, 0));
                    p3Var.P.start();
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.Wallet.z5 z5Var = (org.telegram.ui.Wallet.z5) obj;
                if (z5Var.m0 == animator) {
                    z5Var.m0 = null;
                    z5Var.N0(f10);
                    z5Var.f43461p0.o(false);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28511a) {
            case 5:
                ve0 ve0Var = (ve0) this.f28513c;
                ve0Var.f38994f = true;
                ve0Var.f38992c = this.f28512b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
